	.equ SWI_Exit, 0x11

	.text
	.global _start
_start:
	@@ sets the zero bit in the status register
	mov r0, #5
	cmp r0, #5

	@@ sets the negative bit in the status register
	mov r1, #5
	cmp r1, #20

	@@ move if negative bit set
	@@ because the negative bit was set in the
	@@ previous cmp instruction, the move occurs
	movmi r1, #42

	@@ move if negative bit is NOT set
	@@ because the negative bit was set in the
	@@ previous cmp instruction, the move does NOT occur
	movpl r2, #87

	@@ set the zero bit again...
	mov r0, #0
	cmp r0, #0

	@@ move if the zero bit is set (eq for equal)
	@@ since the zero bit was set with the last cmp
	@@ instruction, the move occurs
	moveq r3, #76

	@@ move if the zero bit is NOT set (ne for not equal)
	@@ since the zero bit was set with the last cmp
	@@ instruction, the move does NOT occur
	movne r4, #99
	
	@@ exit program
	swi SWI_Exit
	.end
