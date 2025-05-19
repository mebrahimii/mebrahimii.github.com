# sorts two numbers
        .text
main:
        # two initial numbers
        li $t0, 50
        li $t1, 10

        # put min in $t3, max in $t4
        #
        # min = $t0
        # max = $t1
        # if ($t1 < $t0) {
        #   min = $t1
        #   max = $t0
        # }
        move $t3, $t0
        move $t4, $t1
        slt $t2, $t1, $t0
        beq $t2, $zero, have_max
        move $t3, $t1
        move $t4, $t0
        
have_max:       
        # print out the result
        li $v0, 1
        move $a0, $t3
        syscall

        li $v0, 1
        move $a0, $t4
        syscall

        # exit the program
        li $v0, 10
        syscall
