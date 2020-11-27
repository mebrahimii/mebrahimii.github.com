	.equ SWI_Open_File, 0x66
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00

	.data
filename:
	.asciz "one_int.txt"

	.text
	.global _start
_start:
        ;; TODO: write your code below this comment

        
	;; exit program
	swi SWI_Exit
	.end
	
