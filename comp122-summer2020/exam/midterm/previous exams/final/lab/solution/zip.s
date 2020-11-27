	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00
	
	.data
first_array:
	.word 10, 3, 8, 18
second_array:
	.word 4, 32, 9, 7
result_array:
	.word -1, -1, -1, -1, -1, -1, -1, -1
first_second_length:
	.word 4

	.text
	.global _start
_start:
	;; r0: from pseudocode
	;; r1: from pseudocode

	;; r2: first_second_length
	;; r3: first_array base
	;; r4: second_array base
	;; r5: result_array base
	
	mov r0, #0
	mov r1, #0
	ldr r2, =first_second_length
	ldr r2, [r2]
	ldr r3, =first_array
	ldr r4, =second_array
	ldr r5, =result_array

begin_while:
	cmp r0, r2
	bpl end_while

	;;  r6: temp
	ldr r6, [r3, r0, LSL #2]
	str r6, [r5, r1, LSL #2]

	add r1, r1, #1

	ldr r6, [r4, r0, LSL #2]
	str r6, [r5, r1, LSL #2]

	add r0, r0, #1
	add r1, r1, #1
	b begin_while

end_while:	
	;; r2: pointer to result array
	;; r3: number of elements left to print
	ldr r2, =result_array
	ldr r3, =first_second_length
	ldr r3, [r3]
	mov r3, r3, LSL #1
	
begin_for:
	cmp r3, #0
	beq end_for

	mov r0, #1
	ldr r1, [r2]
	swi SWI_Print_Int

	mov r0, #'\n
	swi SWI_Print_Char

	add r2, r2, #4
	sub r3, r3, #1
	b begin_for

end_for:
	swi SWI_Exit
	.end
	
