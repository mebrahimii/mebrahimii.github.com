// DO NOT MODIFY ANYTHING IN THIS FILE!!
public class SubClass extends BaseClass {
    public SubClass(String str) {
        super(str);
    }

    public static void main(String[] args) {
        SubClass sub = new SubClass(args[0]);
        sub.printString();
    }
}
