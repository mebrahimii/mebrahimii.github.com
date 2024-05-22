        .data
first_string:
        .asciiz "first\n"
second_string:
        .asciiz "second\n"

        .text
main:
        # TODO: write your code below this comment
        # Your code should do the following, in this order:
        # - Print the first string (first_string)
        # - Print the second string (second_string)
        #
        # As a hint, you can use the la psuedoinstruction to load
        # a label's address into a register, like:
        #
        # la $t0, main # loads main's address into #t0


        # exit program
        li $v0, 10
        syscall
        
