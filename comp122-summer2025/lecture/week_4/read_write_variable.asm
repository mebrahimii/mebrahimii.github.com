        .data
first_value:       
        .word 0
second_value:
        .word 0

        .text
main:
        # read in an integer, store it in first_value
        li $v0, 5
        syscall
        la $t0, first_value
        sw $v0, 0($t0)

        # read in an integer, store it in second_value
        li $v0, 5
        syscall
        la $t0, second_value
        sw $v0, 0($t0)

        # read them both into $t0 and $t1
        la $t2, first_value
        lw $t0, 0($t2)
        la $t2, second_value
        lw $t1, 0($t2)

        # add them and print it out
        addu $a0, $t0, $t1
        li $v0, 1
        syscall

        # exit program
        li $v0, 10
        syscall
