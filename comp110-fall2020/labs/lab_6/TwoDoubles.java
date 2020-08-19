public class TwoDoubles {
    // TODO - write your code below this comment.
    // You need to do the following:
    //
    // 1.) Define two double instance variables named
    //     first and second
    //
    // 2.) Define a constructor which takes two doubles,
    //     and sets the instance variables to the values
    //     of those two doubles.  Instance variable
    //     first needs to be set to the first constructor
    //     parameter, and instance variable second needs to
    //     be set to the second constructor parameter.
    //
    // 3.) Define an instance (not static!) method named
    //     printMe which takes no arguments and doesn't
    //     return anything.  This should print out
    //     the values of the instance variables, with
    //     the Strings "First: " and "Second: " preceding
    //     them.  For example, if the instance variables
    //     held the values 2.3 and 3.4, this should print out:
    //
    //     First: 2.3
    //     Second: 3.4
    //

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first double: ");
        double first = input.nextDouble();
        System.out.print("Enter second double: ");
        double second = input.nextDouble();

        TwoDoubles two = new TwoDoubles(first, second);
        two.printMe();
    }
}
