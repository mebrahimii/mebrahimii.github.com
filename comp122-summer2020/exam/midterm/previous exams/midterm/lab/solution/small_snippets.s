	;; TODO: you may need to define things here
	.equ SWI_Open_File, 0x66
	.equ SWI_Write_Int, 0x6B
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11

	.data
	;; TODO: you may need to define things here
filename:	
	.asciz "myFile.txt"
myArray:
	.word 1, 2, 3
	
	.text
	.global _start
_start:	
	;; PROBLEM #1:
	;;
	;; Open myFile.txt for reading, read an integer from it,
	;; and close the file.  When the code is done, the integer
	;; read in should be in register r5 (it does not have to
	;; be read into r5 initially).
	ldr r0, =filename
	mov r1, #0
	swi SWI_Open_File
	mov r2, r0
	swi SWI_Read_Int
	mov r5, r0
	mov r0, r2
	swi SWI_Close_File

	;; PROBLEM #2:
	;;
	;; Translate the following code:
	;; if (r0 != 8 && r0 >= r1) {
	;;   r2 = r3;
	;; } else {
	;;   r2 = r4;
	;; }
	;;
	cmp r0, #8
	beq problem_2_false
	;; r0 >= r1 AKA
	;; !(r0 < r1)
	cmp r0, r1
	bmi problem_2_false
	mov r2, r3
	b problem_2_after_if
problem_2_false:
	mov r2, r4
problem_2_after_if:	

	;; PROBLEM #3:
	;;
	;; Translate the following code:
	;; r1 = 0;
	;; while (r0 < 10) {
	;;   r1 += r0;
	;;   r0++;
	;; }
	;;
	;; Hint: the initial value of r0 is unknown.
	mov r1, #0
problem_3_loop:
	cmp r0, #10
	bpl problem_3_after_loop
	add r1, r1, r0
	add r0, r0, #1
	b problem_3_loop
problem_3_after_loop:

	;; PROBLEM #4
	;;
	;; Translate the following code, WITHOUT using
	;; branch instructions:
	;; 
	;; if (r0 >= 27) {
	;;   r1++;
	;; } else {
	;;   r1--;
	;; }

	;; r0 >= 27, AKA
	;; !(r0 < 27)
	cmp r0, #27
	addpl r1, r1, #1
	submi r1, r1, #1

	;; PROBLEM #5
	;;
	;; Translate the following code:
	;; 
	;; int myArray[3] = {1, 2, 3};
	;; print(myArray[2]);
	
	mov r0, #1
	ldr r1, =myArray
	add r1, r1, #8
	ldr r1, [r1]
	swi SWI_Write_Int

	;; PROBLEM #6
	;;
	;; End the program
	;;
	swi SWI_Exit
	.end
	
