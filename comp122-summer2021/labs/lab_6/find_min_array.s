	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11

	.data
array:
	.word 7, 87, 2, 26, 14, -5
array_length:
	.word 6

	.text
	.global _start
_start:	
	;; TODO: write your code below this comment

	
	;; exit the program
	swi SWI_Exit
	.end
	
