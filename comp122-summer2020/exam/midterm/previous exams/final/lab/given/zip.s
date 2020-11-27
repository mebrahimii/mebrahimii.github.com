	;; you do not need to define any more .equ
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00
	
	;; you do not need to define anything else
	;; in the .data section
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
        ;; In this file, you must translate some given C/Java-like code
        ;; to assembly.  It is recommended to write your translation to be
        ;; as similar to the above code as possible; the translation
        ;; should be close to one-to-one.  This is not required, but
        ;; if your code isn't working, it will be difficult for me to
        ;; determine what's wrong if you take a radically different approach.
        ;;
        ;; 
        ;; Translate the following code. Your translation should work for
        ;; any value of first_second_length (do NOT hard-code 4), and for
        ;; any values in first_array and second_array.  You may assume that
        ;; the length of first_array and second_array is equal to first_second_length,
        ;; and that the length of result_array is equal to twice first_second_length.
	;;
        ;; 
        ;; int r0 = 0;
	;; int r1 = 0;
        ;; 
	;; while (r0 < first_second_length) {
	;;     result_array[r1] = first_array[r0];
	;;     result_array[r1 + 1] = second_array[r0];
	;;     r0 = r0 + 1;
	;;     r1 = r1 + 2;
	;; }
        ;; 
