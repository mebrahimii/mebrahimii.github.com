	.equ SWI_Open_File, 0x66
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00

	.data
filename:
	.asciz "two_ints.txt"

	.text
	.global _start
_start:
        ;; TODO: write your code below this comment
        ;; Your code should do the following, in this order:
        ;; - Open the file, putting the filehandle in
        ;;   some known register
        ;; - Read the first integer, putting it in some
        ;;   known register
        ;; - Read the second integer, putting it in some
        ;;   known register
        ;; - Add the two integers, print the result,
        ;;   print a newline
        ;; - Subtract the two integers, print the result,
        ;;   print a newline
        ;; - Multiply the two integers, print the result,
        ;;   print a newline
        ;; - Bitwise AND the two integers, print the result,
        ;;   print a newline
        ;; - Bitwise OR the two integers, print the result,
        ;;   print a newline
        ;; - Bitwise XOR the two integers, print the result,
        ;;   print a newline
        ;; - Shift left the two integers, print the result,
        ;;   print a newline
        ;; - Logical shift right the two integers, print the result,
        ;;   print a newline
        ;; - Arithmetic shift right the two integers, print the result,
        ;;   print a newline
        
	;; exit the program
	swi SWI_Exit
	.end
	
