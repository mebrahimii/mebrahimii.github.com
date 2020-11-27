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
	@@ print first string
	ldr r0, =first_string
	swi SWI_Print_String

	@@ print second string
	ldr r0, =second_string
	swi SWI_Print_String

	@@ exit program
	swi SWI_Exit
	.end
