	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00
	.data
array:
	.word 4, 8, 12, 9

	.text
	.global _start
start:
	;; r2: base
	;; r3: position
	ldr r2, =array
	mov r3, #0
	
	;; print first element
	mov r0, #1
	ldr r1, [r2, r3, LSL #2]
	swi SWI_Print_Int

	;; print newline
	mov r0, #'\n
	swi SWI_Print_Char

	;; print second element
	mov r0, #1
	add r3, r3, #1
	ldr r1, [r2, r3, LSL #2]
	swi SWI_Print_Int

	;; print newline
	mov r0, #'\n
	swi SWI_Print_Char

	;; print third element
	mov r0, #1
	add r3, r3, #1
	ldr r1, [r2, r3, LSL #2]
	swi SWI_Print_Int

	;; print newline
	mov r0, #'\n
	swi SWI_Print_Char

	;; print fourth element
	mov r0, #1
	add r3, r3, #1
	ldr r1, [r2, r3, LSL #2]
	swi SWI_Print_Int

	;; print newline
	mov r0, #'\n
	swi SWI_Print_Char

	;; exit program
	swi SWI_Exit
	.end
	
