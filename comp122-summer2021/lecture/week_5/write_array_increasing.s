	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00

	.data
array:
	.word -1, -1, -1, -1, -1, -1

	.text
	.global _start
_start:
	;; This code effectively does:
	;;
	;; int* r2 = array; // r2 holds the address of an integer
	;; int r3 = 0;
	;; do {
	;;   *r2 = r3;
	;;   r2++;
	;;   r3++;
	;; } while (r3 != 6);
	;;

	;; r2: address of current array element
	;; r3: counter
	ldr r2, =array		; start on first element
	mov r3, #0

write_loop_begin:
	str r3, [r2] 		; *r2 = r3;

	;; increment to the next array element
	;; add 4 because words are 4 bytes long
	add r2, r2, #4

	;; increment the counter
	add r3, r3, #1

	;; while (r3 != 6)
	cmp r3, #6
	bne write_loop_begin

	;; Now print out the elements.  See
	;; print_array_fixed_length.s
	;; ...for more details of how this code works.
	;; 
	;; r2: address of current element
	;; r3: number of elements left to print
	ldr r2, =array
	mov r3, #6
print_array_begin:
	;; print the integer
	mov r0, #1
	ldr r1, [r2]
	swi SWI_Print_Int

	;; print a newline
	mov r0, #'\n
	swi SWI_Print_Char

	;; increment postion in the array
	add r2, r2, #4
	
	;; decrement counter
	sub r3, r3, #1

	;; while (r3 != 0)
	cmp r3, #0
	bne print_array_begin

	swi SWI_Exit
	.end
	
