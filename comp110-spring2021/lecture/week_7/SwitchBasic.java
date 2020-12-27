import java.util.Scanner;

public class SwitchBasic {
    public static String intToWeekday(int weekInt) {
        switch (weekInt) {
        case 0:
            return "Monday";
        case 1:
            return "Tuesday";
        case 2:
            return "Wednesday";
        case 3:
            return "Thursday";
        case 4:
            return "Friday";
        case 5:
            return "Saturday";
        case 6:
            return "Sunday";
        default:
            return "Unknown weekday ID: " + weekInt;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weekday ID: ");
        int id = input.nextInt();
        System.out.println(intToWeekday(id));
    }
}
