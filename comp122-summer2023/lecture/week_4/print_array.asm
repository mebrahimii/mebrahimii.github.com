        .data
array_length:
        .word 8
array:
        .word 3, 2, 9, 1, 0, 4, 8, 7

        .text
main:
        # $t0: remaining elements left to print
        # $t1: pointer into the array
        #
        # $t0 = array_length
        # $t1 = array
        # while ($t0 > 0) {
        #   print(*$t1)
        #   $t1++
        #   $t0--
        # }

        # initialize variables
        la $t0, array_length
        lw $t0, 0($t0)
        la $t1, array

loop_begin:
        # the condition in this case is equivalent to checking against
        # 0.  If $t0 == 0, we are done
        beq $t0, $zero, loop_end
        # load and print the integer
        lw $a0, 0($t1)
        li $v0, 1
        syscall
        # print a newline
        li $a0, '\n'
        li $v0, 11
        syscall
        # increment variables
        addiu $t1, $t1, 4 # word size is 4 bytes
        addi $t0, $t0, -1 # one less value
        j loop_begin        
loop_end:
        # end the program
        li $v0, 10
        syscall
