# Swap numbers in $t0 and $t1
        
        .text
main:
        # some original numbers
        li $t0, 5
        li $t1, 10

        # swap them
        move $t2, $t0
        move $t0, $t1
        move $t1, $t2

        # exit the program
        li $v0, 10
        syscall

        
