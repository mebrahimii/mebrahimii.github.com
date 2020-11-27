	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11

	.data
array:
	.word 7, 87, 2, 26, 14, -5
array_length:
	.word 6

	.text
	.global _start

	;; r2: current array position (address)
	;; r3: current min
	;; r4: array length
	;; r5: array position (int)
	ldr r2, =array
	ldr r3, [r2]
	add r2, r2, #4
	ldr r4, =array_length
	ldr r4, [r4]
	mov r5, #1

loop_begin:
	cmp r4, r5
	beq loop_end

	;; load current element
	ldr r0, [r2]

	;; compare to current min
	cmp r0, r3
	movmi r3, r0		; overwrite if less

	;; increment
	add r2, r2, #4
	add r5, r5, #1
	b loop_begin

loop_end:
	;; print minimal element
	mov r0, #1
	mov r1, r3
	swi SWI_Print_Int

	;; exit the program
	swi SWI_Exit
	.end
	
