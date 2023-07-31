        .data
starting_value:
        .word 5
array_length:
        .word 8
array:
        .word 0, 0, 0, 0, 0, 0, 0, 0

        .text
main:
        # $t0: current expected value of array
        # $t1: pointer to current value of array
        # $t2: number of remaining elements in array
        #
        # $t0 = starting_value
        # $t1 = array
        # $t2 = array_length
        # while ($t2 != 0) {
        #   *$t1 = $t0
        #   $t0++
        #   $t1++
        #   $t2--
        # }
        #
        # $t0: number of remaining elements in array
        # $t1: pointer to current value of array
        #
        # $t0 = array_length
        # $t1 = array
        # while ($t0 != 0) {
        #   print(*$t1)
        #   $t1++
        #   $t0--
        # }

        # initialize variables
        la $t0, starting_value
        lw $t0, 0($t0)
        la $t1, array
        la $t2, array_length
        lw $t2, 0($t2)
store_loop_begin:
        beq $t2, $zero, store_loop_end
        sw $t0, 0($t1)
        addiu $t0, $t0, 1
        addiu $t1, $t1, 4
        addi $t2, $t2, -1
        j store_loop_begin
        
store_loop_end:
        # initialize variables
        la $t0, array_length
        lw $t0, 0($t0)
        la $t1, array

print_loop_begin:
        beq $t0, $zero, print_loop_end
        # load and print the value
        lw $a0, 0($t1)
        li $v0, 1
        syscall

        # print a newline
        li $v0, 11
        li $a0, '\n'
        syscall

        # increment variables
        addiu $t1, $t1, 4
        addi $t0, $t0, -1
        j print_loop_begin
        
print_loop_end:
        # exit the program
        li $v0, 10
        syscall
        
