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
	;; Overall total value of this file: 50 points
	;; 
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
