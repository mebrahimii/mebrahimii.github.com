	.equ SWI_Print_String, 0x02
	.equ SWI_Open_File, 0x66
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00

	.data
filename:
	.asciz "two_ints.txt"
min_header:	
	.asciz "Min: "
max_header:
	.asciz "Max: "

	.text
	.global _start
_start:
	;; open file, putting filehandle in r0, r5
	ldr r0, =filename
	mov r1, #0
	swi SWI_Open_File
	mov r5, r0

	;; read first integer, put into r3
	swi SWI_Read_Int
	mov r3, r0

	;; read second integer, put into r4
	mov r0, r5
	swi SWI_Read_Int
	mov r4, r0

	;; close file
	mov r0, r5
	swi SWI_Close_File

	;; calculate min, put into r5
	;; calculate max, put into r6
	mov r5, r3 		; default min: r3
	mov r6, r4 		; default max: r4
	cmp r3, r4
	movpl r5, r4 		; if (r3 - r4) >= 0, min is r4
	movpl r6, r3 		; if (r3 - r4) >= 0, max is r3
	
	;; print min
	ldr r0, =min_header
	swi SWI_Print_String
	mov r1, r5
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	;; print max
	ldr r0, =max_header
	swi SWI_Print_String
	mov r1, r6
	mov r0, #1
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	;; exit program
	swi SWI_Exit
	.end
	
