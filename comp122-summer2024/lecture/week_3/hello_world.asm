        .data
the_string:     
        .asciiz "Hello, world!"

        .text
main:
        # load the string's address into a register
        la $a0, the_string
        li $v0, 4 # print string
        syscall

        # exit program
        li $v0, 10
        syscall
