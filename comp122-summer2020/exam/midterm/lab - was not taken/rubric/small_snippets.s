	;; TODO: you may need to define things here

	.data
	;; TODO: you may need to define things here
	
	.text
	.global _start
_start:	
	;; ------PROBLEM #1------
	;;
	;; Open myFile.txt for reading, read an integer from it,
	;; and close the file.  When the code is done, the integer
	;; read in should be in register r5 (it does not have to
	;; be read into r5 initially).
	;;
	;; - filename defined in .data correctly: 1 point
	;; - file opened correctly: 2 points
	;; - read from file correctly: 3 points
	;; - closed file correctly: 6 points
	;;   Filehandle overwritten: 1 point (harsh, but this was on the review and the pracetice exam)
	;; File not closed but filehandle saved: 8
	;; Total: 12 points


	
	;; ------PROBLEM #2------
	;;
	;; Translate the following code:
	;; if (r0 != 8 && r0 >= r1) {
	;;   r2 = r3;
	;; } else {
	;;   r2 = r4;
	;; }
	;;
	;; - correct comparison to 8 made: 1 point
	;; - correct comparison between r0 and r1 made: 2 points
	;; - jumps to right place on first comparison: 2 points
	;; - jumps to right place on second comparison: 2 points
	;; - no issues with fallthrough on first case: 2 points
	;; - no issues with fallthrough on second case: 2 points
	;; One condition flows into another without branch
	;; instructions: max 6.
	;; Total: 11 points


	
	;; ------PROBLEM #3------
	;;
	;; Translate the following code:
	;; r1 = 0;
	;; while (r0 < 10) {
	;;   r1 += r0;
	;;   r0++;
	;; }
	;;
	;; Hint: the initial value of r0 is unknown.
	;;
	;; - r1 set to 0: 1 point
	;; - correct comparison made: 1 point
	;; - jumps to right place on comparison: 2 points
	;; - add and increment are correct: 1 point
	;; - jumps to start of loop at end: 2 points
	;; - while loop used: 1 point
	;; Total: 8 points



	
	;; ------PROBLEM #4------
	;;
	;; Translate the following code, WITHOUT using
	;; branch instructions:
	;; 
	;; if (r0 >= 27) {
	;;   r1++;
	;; } else {
	;;   r1--;
	;; }
	;;
	;; - Correct comparison made: 1 point
	;; - Does correct thing for true case: 3 points
	;; - Does correct thing for false case: 3 points
	;;   Adds twice on equal: 1 point
	;;   Conditions inverted: 3 points
	;; Max credit if branch used: 3 points
	;; Total: 7 points

	
	;; ------PROBLEM #5------
	;;
	;; Translate the following code:
	;; 
	;; int myArray[3] = {1, 2, 3};
	;; print(myArray[2]);
	;;
	;; - Array defined correctly in .data: 2 points
	;; - Array address loaded: 1 point
	;; - Correct index of array accessed: 4 points
	;; - Integer writing setup is correct: 3 points
	;; Wrong index but rest of setup is ok: 8
	;; Total: 10 points


	
	;; ------PROBLEM #6------
	;;
	;; End the program
	;;
	;; - Exit SWI command issued: 1 point
	;; - .end directive used: 1 point
	;; Total: 2 points

	;; Overall total: 50 points
