	.equ SWI_Open_File, 0x66
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00

	.data
filename:
	.asciz "one_int.txt"

	.text
	.global _start
_start:
	;; open file, putting filehandle in r0, r5
	ldr r0, =filename
	mov r1, #0
	swi SWI_Open_File
	mov r5, r0

	;; read integer, put into r2
	swi SWI_Read_Int
	mov r2, r0

	;; close file
	mov r0, r5
	swi SWI_Close_File

	;; r0: for SWI
	;; r1: for SWI
	;; r2: n
	;; r3: accum

	mov r3, #1 		; accum = 1
while_loop:
	cmp r2, #0 		; while (n != 0)
	beq end_while_loop

	mov r0, r3 		; accum = accum * n
	mul r3, r0, r2

	mov r0, #1 		; print accum
	mov r1, r3
	swi SWI_Print_Int

	mov r0, #'\n 		; print "\n"
	swi SWI_Print_Char

	sub r2, r2, #1		; n = n - 1
	b while_loop

end_while_loop:	
	mov r0, #1 		; print accum
	mov r1, r3
	swi SWI_Print_Int

	mov r0, #'\n 		; print "\n"
	swi SWI_Print_Char

	;; exit program
	swi SWI_Exit
	.end
	
