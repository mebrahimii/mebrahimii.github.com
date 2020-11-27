	.equ SWI_Open_File, 0x66
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11

	.data
filename:
	.asciz "big_if_test_int.txt"

		.text
	.global _start
_start:
	;; open file, putting filehandle in r0, r5
	ldr r0, =filename
	mov r1, #0
	swi SWI_Open_File
	mov r5, r0

	;; read integer, put into r2
	swi SWI_Read_Int
	mov r2, r0

	;; close file
	mov r0, r5
	swi SWI_Close_File

	;; r0: SWI instructions / temp
	;; r1: SWI instructions / temp
	;; r2: Original integer (myInt)
	;; r3: Integer to print out (printInt)

	;; myInt == 0?
	cmp r2, #0
	beq first_branch

	;; myInt >= 500
	cmp r2, #500 ; myInt - 500
	;; if result is positive or zero, fall through to
	;; first_branch (i.e., printInt = 0).  If the result
	;; is negative (meaning !(myInt >= 500), AKA (myInt < 500),
	;; jump to the second clause
	bmi second_branch_first_clause
	
first_branch:
	mov r3, #0
	b after_if

second_branch_first_clause:
	;; myInt > 5 AKA
	;; 5 < myInt
	mov r0, #5
	cmp r0, r2   ; 5 - myInt
	;; if the result is negative, fall through to the
	;; second check.  Otherwise, jump to the next clause
	bpl second_branch_second_clause

	;; myInt < 22
	cmp r2, #22		; myInt - 22
	bpl second_branch_second_clause
	;; if the result is negative, fall through to
	;; printInt = 1.  Otherwise jump to the next clause
	mov r3, #1
	b after_if

second_branch_second_clause:
	;; myInt > 50 AKA
	;; 50 < myInt
	mov r0, #50
	cmp r0, r2		; 50 - myInt
	
	;; if the result is positive or zero, then jump to
	;; the else.  Otherwise fall through to the next check
	bpl else_branch

	;; myInt < 100
	cmp r2, #100 		; myInt - 100
	;; if the result is positive or 0, jump to the else.
	;; otherwise fall through to printInt = 1
	bpl else_branch
	mov r3, #1
	b after_if

else_branch:
	mov r3, #2
	
after_if:
	;;  print out the integer in r3
	mov r0, #1
	mov r1, r3
	swi SWI_Print_Int

	;; exit program
	swi SWI_Exit
	.end
