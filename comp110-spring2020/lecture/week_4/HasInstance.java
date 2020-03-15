public class HasInstance {
    int myInt; // instance variable

    public HasInstance(int setInt) {
        myInt = setInt;
    }

    public static void main(String[] args) {
        HasInstance a = new HasInstance(7);
        HasInstance b = new HasInstance(8);
        // a and b have their own values for myInt,
        // namely 7 and 8, respectively
    }
}
