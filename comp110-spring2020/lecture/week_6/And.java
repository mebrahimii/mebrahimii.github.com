public class And {
    public static void main(String[] args) {
        boolean trueTrue = true && true;
        boolean trueFalse = true && false;
        boolean falseTrue = false && true;
        boolean falseFalse = false && false;
        
        System.out.println("true && true: " + trueTrue);     // prints true
        System.out.println("true && false: " + trueFalse);   // prints false
        System.out.println("false && true: " + falseTrue);   // prints false
        System.out.println("false && false: " + falseFalse); // prints false
    }
}
