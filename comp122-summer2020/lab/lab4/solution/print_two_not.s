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
	@@ open file, putting filehandle in r2
	ldr r0, =filename
	mov r1, #0
	swi SWI_Open_File
	mov r2, r0

	@@ read first int, putting it in r1
	swi SWI_Read_Int
	mov r1, r0

	@@ print out first int, followed by
	@@ a newline
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ print out negation of first int,
	@@ followed by a newline
	mov r0, #1
	mvn r1, r1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ read second int, putting it in r1
	mov r0, r2
	swi SWI_Read_Int
	mov r1, r0

	@@ print out second int, followed by
	@@ a newline
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ print out negation of second int,
	@@ followed by a newline
	mov r0, #1
	mvn r1, r1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	@@ close the file
	mov r0, r2
	swi SWI_Close_File

	@@ exit the program
	swi SWI_Exit
	.end
	
