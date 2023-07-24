        # int x = 0
        # while (x <= 10) {
        #   printf("%i\n", x)
        #   x++
        # }
        #
        # while (!(x > 10)) { ... }
        # while (!(10 < x)) { ... }
        .text
main:   
        # $t0: x
        li $t0, 0
loop_begin:
        li $t1, 10
        slt $t2, $t1, $t0 # 10 < x?
        # $t2 != 0: 10 < x (x > 10)
        # $t2 == 0: 10 >= x (x <= 10)
        bne $t2, $zero, loop_end
        
        # slt $t2, $t0, $t1 # x < 10?
        # beq, bne
        # $t1 != 0: x < 10
        # $t2 == 0: x >= 10
        # beq $t2, $zero, loop_end

        # print integer
        li $v0, 1
        move $a0, $t0
        syscall

        # print newline
        li $v0, 11
        li $a0, '\n'
        syscall

        # increment x
        # add immediate unsigned
        # $t0 = $t0 + 1
        addiu $t0, $t0, 1

        # go back to loop start
        j loop_begin # j: jump
        
loop_end:       
        # exit program
        li $v0, 10
        syscall
        
