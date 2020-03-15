import java.util.Scanner;

public class LetterGrade {
    // The method you write will return a String representing a letter
    // grade (e.g., "A", "A-", "B+", etc.).
    // The letter grade is determined by the given percentage, according
    // to the scale specified on page 2 of the class syllabus (available
    // here: https://kyledewey.github.io/comp110-spring18/syllabus.pdf).
    // You may assume that the given percentage is between 0.0 and 100.0
    // TODO - write your code below this comment.
    
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade as percentage: ");
        double percentage = input.nextDouble();
        System.out.println("Letter grade: " + letterGrade(percentage));
    }
}
