	.equ SWI_Open_File, 0x66
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00

	.data
filename:
	.asciz "two_ints.txt"

	.text
	.global _start
_start:
	@@ open file, putting filehandle in r1
	ldr r0, =filename
	mov r1, #0
	swi SWI_Open_File
	mov r1, r0

	@@ read first integer, putting it in r2
	swi SWI_Read_Int
	mov r2, r0

	@@ read second integer, putting it in r3
	mov r0, r1
	swi SWI_Read_Int
	mov r3, r0

	@@ close the file
	mov r0, r1
	swi SWI_Close_File

	@@ add integers and print it out, followed
	@@ by a newline
	add r1, r2, r3
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ subtract integers and print it out,
	@@ followed by a newline
	sub r1, r2, r3
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ multiply ints, print, newline
	mul r1, r2, r3
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ AND ints, print, newline
	and r1, r2, r3
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ OR ints, print, newline
	orr r1, r2, r3
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ EOR ints, print, newline
	eor r1, r2, r3
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ shift left ints, print, newline
	mov r1, r2, LSL r3
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ logical shift right ints, print, newline
	mov r1, r2, LSR r3
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ arith shift right ints, print, newline
	mov r1, r2, ASR r3
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ exit the program
	swi SWI_Exit
	.end
	
