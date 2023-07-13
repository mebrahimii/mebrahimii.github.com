;;; This program performs a bunch of arithmetic
;;; operations over two numbers.  While it doesn't
;;; print their results, you can see them
;;; in the register values in ARMSim# if you
;;; single-step through the code.
	
        ;; define some constants
	.equ SWI_Exit, 0x11

        ;; text section - executable portion of
        ;; your code
	.text

	;; makes _start available to the linker
        ;; this is effectively part of "main"'s definition
	.global _start
_start:
	;; put 5 and 2 into registers r0 and r1
	mov r0, #5
	mov r1, #2

	;; add them together, putting the
	;; result in r2
	add r2, r0, r1

	;; subtraction into r3
	sub r3, r0, r1

	;; multiplication into r4
	mul r4, r0, r1

	;; AND into r5
	and r5, r0, r1

	;; OR into r6
	orr r6, r0, r1

	;; XOR into r7
	eor r7, r0, r1

	;; shift left into r8
	;; LSL: logical shift left
	mov r8, r0, LSL r1

	;; logical shift right into r9
	;; LSR: logical shift right
	mov r9, r0, LSR r1

	;; arithmetic shift right into r10
	;; ASR: arithmetic shift right
	mov r10, r0, ASR r1

	;; tell ARMSim# the program is done
	swi SWI_Exit
	.end
