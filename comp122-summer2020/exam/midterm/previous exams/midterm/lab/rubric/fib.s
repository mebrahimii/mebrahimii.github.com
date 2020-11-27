	;; you do not need to define any more .equ
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00

        .data
	;; you do not need to define anything else
	;; in the .data section
memo:
        .word 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0

	.text
	.global _start
_start:
	;; Translate the following code:
	;;
	;; int r0 = 2;
	;; do {
	;;   int r1 = memo[r0 - 1];
	;;   int r2 = memo[r0 - 2];
	;;   int r3 = r1 + r2;
	;;   memo[r0] = r3;
	;;   r0++;
	;; } while (r0 < 10);
        ;; 
	;; - r0 initialized to 2: 2 points
	;; - base address of array loaded: 2 points
	;; - offset r0 - 1 calculated correctly: 4 points
	;;     Used 1 instead: 2 points
	;; - value from memo[r0 - 1] ends up in r1: 7 points
	;;     Load of wrong thing: 3 points
	;; - offset r0 - 2 calculated correctly: 4 points
	;;     Used 1 instead: 2 points
	;; - value from memo[r0 - 2] ends up in r1: 7 points
	;;     Load of wrong thing: 3 points
	;; - r3 calculated correctly: 2 points
	;; - value of r3 ends up in memo[r0]: 8 points
	;;     Store of wrong thing: 3 points
	;; - r0 incremented correctly: 2 points
	;; - r0 compared correctly: 2 points
	;; - jumps to correct place on comparison: 8 points
	;;     Inverse of correct: 3 points
	;; - exits program: 2 points
	;; Total: 50 points
	
