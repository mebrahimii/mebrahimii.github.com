	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00

	.data
array:
	.word 78, 23, 90, 42, 123, 57, 22
array_length:
	.word 7			; 7 elements above

	.text
	.global _start
_start:	
	;; if array_length were changed, the array *could* be
	;; empty.  As such, this code effectively does:
	;;
	;; int* r2 = array; // r2 holds the address of an integer
	;; int r3 = *array_length;
	;; while (r3 != 0) {
	;;   println(*r2);
	;;   r2++;
	;;   r3--;
	;; }
	;;

	;; r2: address of current element
	;; r3: number of elements left to print
	ldr r2, =array 		; start on first element
	ldr r3, =array_length	; put address of array_length in r3...
	ldr r3, [r3] 		; read value at address r3 into r3

loop_begin:
	cmp r3, #0
	beq loop_end 		; while (r3 != 0)

	;; print the integer
	mov r0, #1 		; write to stdout
	ldr r1, [r2]		; read integer from array
	swi SWI_Print_Int	; print it out

	;; print out a newline
	mov r0, #'\n
	swi SWI_Print_Char

	;; increment to the next array element
	;; add 4 because words are 4 bytes long
	add r2, r2, #4

	;; decrement number of elements left
	sub r3, r3, #1

	;; go to the start of the loop again
	b loop_begin

loop_end:
	;; exit the program
	swi SWI_Exit
	.end
	
