	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00

	.data
first_var:
	.word 5
second_var:
	.word 28

	.text
	.global _start
_start:	
	;; first, print the contents of both variables

	;; start with first_var
	mov r0, #1		; write to standard output...
	ldr r2, =first_var 	; address of first_var in r2...
	;; treat value in r2 as a memory address, read the value at
	;; that address, and put the value in r1
	ldr r1, [r2]

	;; print it out
	swi SWI_Print_Int

	;; print newline
	mov r0, #'\n
	swi SWI_Print_Char
	
	;; now for second_var
	mov r0, #1		; write to standard output...
	ldr r2, =second_var 	; address of second_var in r2...
	ldr r1, [r2] 		; read it in...
	swi SWI_Print_Int 	; print it out

	;; print newline
	mov r0, #'\n
	swi SWI_Print_Char

	;; write the value "67" to first_var
	ldr r0, =first_var 	; address of first_var in r0
	mov r1, #67
	str r1, [r0]		; store 67 in memory at address r0

	;; write the value "98" to second_var
	ldr r0, =second_var 	; address of second_var in r0
	mov r1, #98
	str r1, [r0] 		; store 98 in memory at address r0

	;; print first_var again
	mov r0, #1
	ldr r1, =first_var
	ldr r1, [r1]
	swi SWI_Print_Int

	;; print newline
	mov r0, #'\n
	swi SWI_Print_Char

	;; print second_var again
	mov r0, #1
	ldr r1, =second_var
	ldr r1, [r1]
	swi SWI_Print_Int
	
	swi SWI_Exit
	.end
	
