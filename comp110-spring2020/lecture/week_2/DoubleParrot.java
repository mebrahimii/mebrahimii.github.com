import java.util.Scanner;

public class DoubleParrot 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter something to be repeated: ");
        String line1 = in.nextLine();
        System.out.print("Enter something else to be repeated: ");
        String line2 = in.nextLine();
        System.out.println(line1 + " " + line2);
    }
}
