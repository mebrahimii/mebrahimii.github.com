@@@ This program performs a bunch of arithmetic
@@@ operations over two numbers.  While it doesn't
@@@ print their results, you can see them
@@@ in the register values in ARMSim# if you
@@@ single-step through the code.
	
        @ define some constants
	.equ SWI_Exit, 0x11

        @ text section - executable portion of
        @ your code
	.text

	@ makes _start available to the linker
        @ this is effectively part of "main"'s definition
	.global _start
_start:
	@ put 5 and 2 into registers r0 and r1
	@ r0 : 0000 0101
	@ r1 : 0000 0010
	mov r0, #5
	mov r1, #2

	@ add them together, putting the
	@ result in r2
	@ r2 : 0000 0111
	add r2, r0, r1

	@ subtraction into r3
	@ r3 : 0000 0011
	sub r3, r0, r1

	@ multiplication into r4
	@ r4 : 0000 1010
	mul r4, r0, r1

	@ AND into r5
	@ r5 : 0000 0000
	and r5, r0, r1

	@ OR into r6
	@ r6 : 0000 0111
	orr r6, r0, r1

	@ XOR into r7
	@ r7 : 0000 0111
	eor r7, r0, r1

	@ shift left into r8
	@ LSL: logical shift left
	@ r8 : 0001 0100
	mov r8, r0, LSL r1

	@ logical shift right into r9
	@ LSR: logical shift right
	@ r9 : 0000 0001
	mov r9, r0, LSR r1

	@ arithmetic shift right into r10
	@ ASR: arithmetic shift right
	@ r10 : 0000 0001
	mov r10, r0, ASR r1

	@ tell ARMSim# the program is done
	swi SWI_Exit
	.end