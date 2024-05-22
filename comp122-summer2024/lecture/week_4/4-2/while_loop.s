	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11

	.text
_start:
	;; r0: SWI instructions / temp
	;; r1: SWI instructions / temp
	;; r2: loop counter (x)

	mov r2, #0
the_loop:
	;; x < 10 AKA
	cmp r2, #10 		; x - 10
	bpl loop_end
	;; if (x - 10 >= 0), jump to loop_end
	;; this only happens if x >= 10

	add r2, r2, #1
	b the_loop

loop_end:
	;; print x
	mov r0, #1
	mov r1, r2
	swi SWI_Print_Int

	;; exit program
	swi SWI_Exit
	.end
