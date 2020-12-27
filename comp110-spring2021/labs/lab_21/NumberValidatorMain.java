// DO NOT EDIT ANY OF THE CODE IN THIS FILE!
public class NumberValidatorMain {
    public static void doParse(NumberValidator validator,
                               String input) {
        try {
            int parsed = validator.parseNumber(input);
            System.out.println("Parsed and valid: " + parsed);
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        doParse(new PositiveNumber(), args[0]);
        doParse(new NonNegativeNumber(), args[1]);
    }
}

        
