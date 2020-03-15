public class HasInstance2 {
    int myInt; // instance variable

    public HasInstance2(int setInt) {
        myInt = setInt;
    }

    public void printInt() {
        System.out.println(myInt);
    }
    
    public static void main(String[] args) {
        HasInstance2 a = new HasInstance2(7);
        HasInstance2 b = new HasInstance2(8);

        a.printInt();
        b.printInt();
    }
}
