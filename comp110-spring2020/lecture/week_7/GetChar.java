import java.util.Scanner;

public class GetChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String target = "apple";
        System.out.print("Enter a position: ");
        int position = input.nextInt();
        char read = target.charAt(position);
        System.out.println(read);
    }
}

        
