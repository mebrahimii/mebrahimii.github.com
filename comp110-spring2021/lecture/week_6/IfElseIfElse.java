import java.util.Scanner;

public class IfElseIfElse {
    public static String englishName(int input) {
        if (input == 1) {
            return "one";
        } else if (input == 2) {
            return "two";
        } else if (input == 3) {
            return "three";
        } else {
            return "unknown";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myInt = input.nextInt();
        System.out.println("English name: " + englishName(myInt));
    }
}

                
