        ;; define some constants
	.equ SWI_Print_String, 0x02
	.equ SWI_Exit, 0x11

        ;; data section - data your code will use
        .data
to_print:
        ;; .asciz : string that ends in a null byte
	.asciz "Hello, world!"

        ;; text section - executable portion of
        ;; your code
	.text

        ;; makes _start available to the linker
        ;; this is effectively part of "main"'s definition
	.global _start
_start:
        ;; load a pointer to the string into
        ;; register r0
	ldr r0, =to_print

        ;; direct ARMSim# to print out the string
	swi SWI_Print_String

        ;; direct ARMSim# to exit
	swi SWI_Exit
	.end
