# Adds up all numbers between 0 and N.
# For example, if N = 3, then it would find 0 + 1 + 2 + 3 = 6
        .text
main:
        # sum = 0
        # while (n != 0) {
        #   sum += n
        #   n--
        # }
        
        li $t0, 3       # value of N
        li $t1, 0       # running sum

loop:   
        beq $t0, $zero, loop_exit
        addu $t1, $t1, $t0
        addi $t0, $t0, -1
        j loop
        
loop_exit:      
        # print out the result
        li $v0, 1
        move $a0, $t1
        syscall

        # exit the program
        li $v0, 10
        syscall
