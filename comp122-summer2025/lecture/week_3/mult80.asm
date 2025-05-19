# multiplies a given number by 80
        .text
main:
        # some initial unsigned number
        li $t0, 5

        # what to multiply by
        li $t1, 80

        # multiply, putting result in $t2
        mult $t0, $t1
        mflo $t2
        
        # print out the result
        li $v0, 1
        move $a0, $t2
        syscall

        # exit the program
        li $v0, 10
        syscall
