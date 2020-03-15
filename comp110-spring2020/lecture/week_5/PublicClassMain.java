public class PublicClassMain {
    public static void main(String[] args) {
        // Can use this constructor because it's public
        PublicClass pc = new PublicClass(5);
        
        // Can access the instance variable i directly
        // because it's public
        System.out.println(pc.i);

        // Can call the printI method because it's public
        pc.printI();
    }
}
