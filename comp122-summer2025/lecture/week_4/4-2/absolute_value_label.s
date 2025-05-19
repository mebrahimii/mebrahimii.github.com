	.equ SWI_Open_File, 0x66
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11

	.data
filename:
	.asciz "one_negative_int.txt"

	.text
	.global _start
_start:
	@@ open file, putting filehandle in r0, r5
	ldr r0, =filename
	mov r1, #0
	swi SWI_Open_File
	mov r5, r0

	@@ read integer, put into r2
	swi SWI_Read_Int
	mov r2, r0

	@@ close file
	mov r0, r5
	swi SWI_Close_File

	@@ test if the integer read in is less than 0
	cmp r2, #0

	@@ if it is NOT, skip to after_if
	bpl after_if

	@@ if it is less than zero, we get here
	@@ negate it
	sub r2, r3, r2

after_if:	
	@@ print the integer
	mov r0, #1
	mov r1, r2
	swi SWI_Print_Int

	@@ exit program
	swi SWI_Exit
	.end
