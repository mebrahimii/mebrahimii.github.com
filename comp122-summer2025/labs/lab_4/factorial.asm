        # Reads in an integer from the user, computes the factorial of it,
        # and prints it out
        .text
main:
        # input_value = readNum()
        # result = 1
        # while (input_value > 0) {
        #   result = result * input_value
        #   input_value--
        # }
        # print(result)

        # TODO: add your code below.
        # This should read an integer, compute its factorial, and print it out.
        # You can do this however you'd like, though the pseuocode in the above
        # comments may be a helpful approach.

        # exit the program
        li $v0, 10
        syscall
        
