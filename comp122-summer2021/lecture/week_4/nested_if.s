	.equ SWI_Open_File, 0x66
	.equ SWI_Read_Int, 0x6C
	.equ SWI_Print_Int, 0x6B
	.equ SWI_Close_File, 0x68
	.equ SWI_Exit, 0x11

	.data
filename:
	.asciz "nested_if_test_int.txt"

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

	;; r2: integer read in (myInt)
	;; r3: integer to print (printInt)
	
	;; test if the integer read in is less than 10
	cmp r2, #10

	;; if it's not, jump to the outer else
	bpl outer_else

	;; if it is less than 10, we get here
	;; test if r2 <= 6 (AKA !(r2 > 6), AKA !(6 < r2))
	mov r0, #6
	cmp r0, r2
	bmi inner_else
	;; if 6 < r2, then the original condition of
	;; r2 <= 6 doesn't hold, hence we jump to the inner
	;; else

	;; if the condition did hold, we get here
	mov r3, #0
	b after_outer_if

inner_else:
	mov r3, #1
	b after_outer_if
	
outer_else:
	mov r3, #2
	;; could do b after_outer_if, but we fall
	;; through to that code anyway
	
after_outer_if:
	;; print out the integer
	mov r0, #1
	mov r1, r3
	swi SWI_Print_Int

	;; exit program
	swi SWI_Exit
	.end
