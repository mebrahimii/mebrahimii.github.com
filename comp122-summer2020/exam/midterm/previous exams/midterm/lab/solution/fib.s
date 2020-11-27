	.equ SWI_Print_Int, 0x6B
	.equ SWI_Exit, 0x11
	.equ SWI_Print_Char, 0x00

        .data
memo:
        .word 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0

	.text
	.global _start
_start:	
        ;; cur = 2;
        ;; do {
        ;;   memo[cur] = memo[cur - 1] + memo[cur - 2];
        ;;   cur++;
        ;; } while (cur < 10);

        ;; REWRITTEN:
        ;; int r0 = 2;
        ;; int* r1 = memo + 2;
        ;; do {
        ;;   *r1 = *(r1 - 1) + *(r1 - 2);
        ;;   r0++;
        ;;   r1++;
        ;; } while (r0 < 10);

        mov r0, #2
        ldr r1, =memo
        add r1, r1, #8

loop:
        ;; r2: *(r1 - 1)
        ;; r3: *(r1 - 2)
        ;; r4: *(r1 - 1) + *(r1 - 2)
        ldr r2, [r1, #-4]
        ldr r3, [r1, #-8]
        add r4, r2, r3
        str r4, [r1]
        add r0, r0, #1
        add r1, r1, #4
        cmp r0, #10
        bmi loop

        ;; print contents of array
        ;; int r2 = 10;
        ;; int* r3 = memo;
        ;; do {
        ;;   print(*r3);
        ;;   r2--;
        ;;   r3++;
        ;; } while (r2 != 0);

        mov r2, #10
        ldr r3, =memo
        
print_loop:
        mov r0, #1
        ldr r1, [r3]
        swi SWI_Print_Int

        mov r0, #'\n
        swi SWI_Print_Char
        
        sub r2, r2, #1
        add r3, r3, #4
        cmp r2, #0
        bne print_loop

        swi SWI_Exit
        .end
        
