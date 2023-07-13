MOV		r2, #10 @ Load the value 10 into register r2
MOV		r3, #2 @ Load the value 2 into register r3
MUL		r1,		r2, r3 @ Compute r2*r3 and store in r1 (10*2 = 20)
MOV		r0, #1 @ Load 1 into register r0 (stdout handle)
SWI		0x6b		@ Print integer in register r1 to stdout
SWI		0x11		@ Stop program execution
