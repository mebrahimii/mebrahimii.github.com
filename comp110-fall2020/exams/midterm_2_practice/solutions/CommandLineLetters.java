public class CommandLineLetters {
    public static void main(String[] args) {
        for (int index = 0; index < args.length; index++) {
            String current = args[index];
            char firstChar = current.charAt(0);
            if (firstChar == 'a' || firstChar == 'b' || firstChar == 'c') {
                System.out.println(current);
            }
        }
    }
}

            
