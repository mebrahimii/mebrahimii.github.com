        .data
array_length:
        .word 8
array:
        .word 2, 1, 9, 3, 7, 4, 0, 2

        .text
main:
        # num_remaining = array_length
        # pointer = array
        # result = 0
        # while (num_remaining != 0) {
        #   result = result + *pointer
        #   pointer++
        #   num_remaining--
        # }
        # print(result)
        
        # TODO: add your code below.
        # This should get the sum of all the elements in the array.
        # This should work for any array_length > 0, and any
        # array.  You can assume the array holds array_length words.
        # You can implement this however, you'd like, though it's
        # recommended to follow the above pseudocode.

        # exit the program
        li $v0, 10
        syscall
        
