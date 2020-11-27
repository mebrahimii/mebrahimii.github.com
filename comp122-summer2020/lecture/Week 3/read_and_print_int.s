        @ define some constants
	.equ SWI_Open_File, 0x66
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11

        @ data section - data your code will use
	.data
filename:
        @ .asciz : string that ends in a null byte
	.asciz "int.txt"
	
        @ text section - executable portion of
        @ your code
	.text

	@ makes _start available to the linker
        @ this is effectively part of "main"'s definition
	.global _start
_start:
	@ load a pointer to the string into
        @ register r0
	ldr r0, =filename
	mov r1, #0 		@ open for reading
	swi SWI_Open_File	@ open the file

	@ move the filehandle (stored in r0)
	@ into register r5 for safekeeping
	mov r5, r0

	@ read an integer from the file
	@ reads from register r0, which still
	@ holds the filehandle.  The integer
	@ is read into register r0, overwriting
	@ the register
	swi SWI_Read_Int

	@ setup to print out the integer
	@ we must move the integer to print
	@ into register r1, and we want to
	@ print the integer to standard out
	@ (indicated by having value 1 in
	@ register r0 when SWI_Print_Int is
	@ used)
	mov r1, r0
	mov r0, #1
	swi SWI_Print_Int

	@ close the file, which looks for
	@ a filehandle in register r0.
	@ As such, we must move our filehandle
	@ back to r0 before SWI_Close_File can
	@ be used
	mov r0, r5
	swi SWI_Close_File

	@ tell ARMSim# the program is done
	swi SWI_Exit
	.end