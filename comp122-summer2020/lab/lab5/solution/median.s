	.equ SWI_Open_File, 0x66
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11

	.data
filename:
	.asciz "three_ints.txt"

	.text
	.global _start
_start:
	;; open file, putting filehandle in r0, r5
	ldr r0, =filename
	mov r1, #0
	swi SWI_Open_File
	mov r5, r0

	;; read first integer, put into r2
	swi SWI_Read_Int
	mov r2, r0

	;; read second integer, put into r3
	mov r0, r5
	swi SWI_Read_Int
	mov r3, r0

	;; read third integer, put into r4
	mov r0, r5
	swi SWI_Read_Int
	mov r4, r0

	;; close file
	mov r0, r5
	swi SWI_Close_File

	;; bubble sort over registers
	;; if r2 >= r3, swap
	;; if r3 >= r4, swap
	;; if r2 >= r3, swap
	cmp r2, r3
	eorpl r2, r2, r3
	eorpl r3, r2, r3
	eorpl r2, r2, r3

	cmp r3, r4
	eorpl r3, r3, r4
	eorpl r4, r3, r4
	eorpl r3, r3, r4

	cmp r2, r3
	eorpl r2, r2, r3
	eorpl r3, r2, r3
	eorpl r2, r2, r3

	;; print median
	mov r1, r3
	mov r0, #1
	swi SWI_Print_Int

	;; exit program
	swi SWI_Exit
	.end
	
