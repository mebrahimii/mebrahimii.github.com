        .data
array_max_size:     
        .word 10
array:
        .word 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        .text
main:
        # $t0: the maximum array size
        # $t1: the actual size of the array
        # $t2: pointer into the array
        # $t3: integer read in
        #
        # t0 = 10
        # t1 = 0
        # t2 = array
        # t3 = readNum()
        # while (t3 != 0 && t1 < t0) {
        #   *t2 = t3
        #   t1++
        #   t2++
        #   t3 = readNum()
        # }
        #
        # t2 = array
        # t3 = 0
        # while (t3 < t1) {
        #   print(*t2)
        #   t3++
        #   t2++
        # }

        # initialize variables
        li $t0, 10
        li $t1, 0
        la $t2, array

        # read an integer
        li $v0, 5
        syscall
        move $t3, $v0

read_loop_begin:
        beq $t3, $zero, read_loop_end # t3 != 0?
        slt $t4, $t1, $t0 # t1 < $t0?
        beq $t4, $zero, read_loop_end
        sw $t3, 0($t2)    # *t2 = t3
        addiu $t1, $t1, 1 # t1++
        addiu $t2, $t2, 4 # t2++
        li $v0, 5 # read an integer
        syscall
        move $t3, $v0
        j read_loop_begin
        
read_loop_end:  
        la $t2, array
        li $t3, 0
print_loop_begin:
        slt $t4, $t3, $t1 # t3 < t1?
        beq $t4, $zero, print_loop_end
        # load and print the integer
        lw $a0, 0($t2)
        li $v0, 1
        syscall
        # print a newline
        li $a0, '\n'
        li $v0, 11
        syscall
        # increment
        addiu $t3, $t3, 1
        addiu $t2, $t2, 4
        j print_loop_begin
        
print_loop_end:
        # exit program
        li $v0, 10
        syscall
