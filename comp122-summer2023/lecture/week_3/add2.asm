# Adds two numbers together,
# prints the result, and then exits


        .text # indicates the start of code

main:         # always start with main
        # add the numbers
        li $t0, 5
        li $t1, 7
        add $t2, $t0, $t1

        # print out the result
        li $v0, 1
        move $a0, $t2
        syscall

        # exit the program
        li $v0, 10
        syscall
        
