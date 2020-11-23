public class ThisExample {
    public ThisExample returnThis() {
        return this;
    }

    public static void main(String[] args) {
        ThisExample x = new ThisExample();
        System.out.println(x.toString());

        ThisExample returned = x.returnThis();
        System.out.println(returned.toString());
    }
}

                          
