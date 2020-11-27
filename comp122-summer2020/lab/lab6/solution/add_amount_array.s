	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00

	.data
array_source:
	.word 42, 67, 81, 90, 124, -5
array_sink:
	.word 0, 0, 0, 0, 0, 0
array_length:
	.word 6
add_amount:
	.word 5
	
	.text
	.global _start

	;; r2: current source position
	;; r3: current sink position
	;; r4: array length
	;; r5: counter
	;; r6: amount to add
	ldr r2, =array_source
	ldr r3, =array_sink
	ldr r4, =array_length
	ldr r4, [r4]
	mov r5, #0
	ldr r6, =add_amount
	ldr r6, [r6]

add_loop_begin:
	;; still in loop?
	cmp r4, r5
	beq add_loop_end

	;; load element, increment, and store
	ldr r0, [r2]
	add r0, r0, r6
	str r0, [r3]

	;; increment position
	add r2, r2, #4
	add r3, r3, #4
	add r5, r5, #1
	b add_loop_begin

add_loop_end:
	;; r2: current sink position
	;; r3: array length
	;; r4: counter
	ldr r2, =array_sink
	ldr r3, =array_length
	ldr r3, [r3]
	mov r4, #0
	
print_loop_begin:
	;; still in loop?
	cmp r3, r4
	beq print_loop_end

	;; get element and print it
	mov r0, #1
	ldr r1, [r2]
	swi SWI_Print_Int
	mov r0, #'\n
	swi SWI_Print_Char

	;; increment
	add r2, r2, #4
	add r4, r4, #1
	b print_loop_begin

print_loop_end:	
	;; end the program
	swi SWI_Exit
	.end
	
