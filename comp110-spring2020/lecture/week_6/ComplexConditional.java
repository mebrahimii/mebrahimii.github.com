public class ComplexConditional {
    public static int someMethod(int param) {
        if (param == 5 || param < 0) {
            return 0;
        } else if (param > 8 && param <= 20) {
            return 1;
        } else if (!(param < 100)) {
            return 2;
        } else {
            return 3;
        }
    }

    // No main defined.
    // We cannot run this program as-is, but we can test it
    // (see ComplexConditionalTest.java)
}
