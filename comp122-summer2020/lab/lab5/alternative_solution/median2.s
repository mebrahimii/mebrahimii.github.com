	.equ SWI_Open_File, 0x66
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11

	.data
filename:
	.asciz "three_ints.txt"

	.text
	.global _start
_start:
	;; open file, putting filehandle in r0, r5
	ldr r0, =filename
	mov r1, #0
	swi SWI_Open_File
	mov r5, r0

	;; read first integer, put into r2
	swi SWI_Read_Int
	mov r2, r0

	;; read second integer, put into r3
	mov r0, r5
	swi SWI_Read_Int
	mov r3, r0

	;; read third integer, put into r4
	mov r0, r5
	swi SWI_Read_Int
	mov r4, r0

	;; close file
	mov r0, r5
	swi SWI_Close_File

	;; another way of doing the swap, using a more
	;; traditional approach.
	;; if ((r2 >= r3 && r4 >= r2) ||
	;;     (r2 >= r4 && r3 >= r2)) {
	;;   median = r2;
	;; } else if ((r3 >= r2 && r4 >= r3) ||
	;;            (r3 >= r4 && r3 >= r2)) {
	;;   median = r3;
	;; } else {
	;;   median = r4;
	;; }
	;; 
	;; median moved into r5
	cmp r2, r3
	bmi first_branch_second_test
	cmp r4, r2
	bmi first_branch_second_test
	mov r5, r2
	b after_conditional
	
first_branch_second_test:	
	cmp r2, r4
	bmi second_branch_first_test
	cmp r3, r4
	bmi second_branch_first_test
	mov r5, r2
	b after_conditional

second_branch_first_test:
	cmp r3, r2
	bmi second_branch_second_test
	cmp r4, r3
	bmi second_branch_second_test
	mov r5, r3
	b after_conditional

second_branch_second_test:
	cmp r3, r4
	bmi else_branch
	cmp r3, r2
	bmi else_branch
	mov r5, r3
	b after_conditional

else_branch:
	mov r5, r4

after_conditional:	
	;; print median
	mov r1, r5
	mov r0, #1
	swi SWI_Print_Int

	;; exit program
	swi SWI_Exit
	.end
	
