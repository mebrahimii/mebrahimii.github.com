        .data
amount_to_add:
        .word 3
array_length:
        .word 8
input_array:
        .word 3, 2, 8, 4, 6, 7, 0, 1
output_array:
        .word 0, 0, 0, 0, 0, 0, 0, 0

        .text
main:
        # num_remaining = array_length
        # input_pointer = input_array
        # output_pointer = output_array
        # while (num_remaining != 0) {
        #   *output_pointer = *input_pointer + amount_to_add
        #   input_pointer++
        #   output_pointer++
        #   num_remaining--
        # }

        # TODO: add your code below.
        # This should take each input_array element, add amount_to_add,
        # and store the result in the corresponding output_array element.
        # The elements in input_array should never change.  You can
        # implement this however you'd like, though it's recommended to
        # follow the above pseudocode.

        

        # The code below prints all the elements of output_array
        # $t0: number of elements remaining
        # $t1: pointer into output array
        la $t0, array_length
        lw $t0, 0($t0)
        la $t1, output_array

        # while ($t0 != 0) {
        #   print(*$t1)
        #   $t0--
        #   $t1++
        # }
print_loop_begin:       
        beq $t0, $zero, print_loop_end
        # print the integer
        lw $a0, 0($t1)
        li $v0, 1
        syscall
        # print a newline
        li $a0, '\n'
        li $v0, 11
        syscall
        # adjust variables
        addi $t0, $t0, -1
        addiu $t1, $t1, 4
        j print_loop_begin
        
print_loop_end:
        # exit the program
        li $v0, 10
        syscall
