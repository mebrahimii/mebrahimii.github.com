# stores the max of two numbers
        .text
main:
        # two initial numbers
        li $t0, 5
        li $t1, 10

        # put max in $t3
        #
        # max = $t0
        # if ($t0 < $t1) {
        #   max = $t1
        # }
        move $t3, $t0
        slt $t2, $t0, $t1         # $t0 < $t1?
        beq $t2, $zero, have_max  # if not, we are done
        move $t3, $t1

have_max:
        # print out the result
        li $v0, 1
        move $a0, $t3
        syscall

        # exit the program
        li $v0, 10
        syscall
