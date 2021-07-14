	.equ SWI_Print_String, 0x02
	.equ SWI_Exit, 0x11

	.data
first_string:
	.asciz "first\n"
second_string:
	.asciz "second\n"

	.text
	.global _start
_start:
        ;; TODO: write your code below this comment
        ;; Your code should do the following, in this order:
        ;; - Print the first string
        ;; - Print the second string

	;; Exit the program
	swi SWI_Exit
	.end
