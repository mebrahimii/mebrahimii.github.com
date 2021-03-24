public class MultiplyAllArgs {
    public static void main(String[] args) {
        int result = 1;
        for (int x = 0; x < args.length; x++) {
            result *= Integer.parseInt(args[x]); // result = result * Integer.parseInt(ar)
        }
        System.out.println(result);
    }
}

        
