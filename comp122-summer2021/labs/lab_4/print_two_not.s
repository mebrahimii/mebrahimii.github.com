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
        ;; - Print out the first integer read
        ;; - Print out a newline
        ;; - Negate the first integer
        ;; - Print out the negated integer
        ;; - Print out a newline
        ;; - Read the second integer, putting it in some
        ;;   known register
        ;; - Print out the second integer read
        ;; - Print out a newline
        ;; - Negate the second integer
        ;; - Print out the negated integer
        ;; - Print out a newline
        ;; - Close the file

	;; exit the program
	swi SWI_Exit
	.end
	
