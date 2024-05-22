# divides a given number by 80
        .text
main:
        # some initial unsigned number
        li $t0, 400

        # what to divide by
        li $t1, 80

        # multiply, putting result in $t2
        divu $t0, $t1
        mflo $t2
        
        # print out the result
        li $v0, 1
        move $a0, $t2
        syscall

        # exit the program
        li $v0, 10
        syscall
