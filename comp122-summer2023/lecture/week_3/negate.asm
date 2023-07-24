# negate a signed number
        .text
main:
        # some original number
        li $t0, 1

        # negate the bits, putting result in $t1
        nor $t1, $zero, $t0
        addi $t1, $t1, 1

        # print out the result
        li $v0, 1
        move $a0, $t1
        syscall

        # exit the program
        li $v0, 10
        syscall
