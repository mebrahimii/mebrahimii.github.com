        .text
main:
        # read integer
        li $v0, 5
        syscall
        move $t0, $v0

        # print it out, followed by newline
        move $a0, $t0
        li $v0, 1
        syscall
        li $a0, '\n'
        li $v0, 11
        syscall

        # exit program
        li $v0, 10
        syscall
