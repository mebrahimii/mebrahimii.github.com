public class FinallyExample {
    public static void maybeThrowException() throws Exception {
        System.out.println("maybeThrowException");
        throw new Exception();
    }

    public static void maybeDoThis() throws Exception {
        System.out.println("maybeDoThis");
        throw new Exception();
    }

    public static void maybeDoThat() throws Exception {
        System.out.println("maybeDoThat");
        throw new Exception();
    }

    public static void maybeDoTheOtherThing() throws Exception {
        System.out.println("maybeDoTheOtherThing");
        throw new Exception();
    }

    public static void alwaysDoThis() throws Exception {
        System.out.println("alwaysDoThis");
        throw new Exception();
    }
    
    public static void main(String[] args) throws Exception {
        try {
            maybeThrowException();
            maybeDoThis();
        } catch (Exception e) {
            maybeDoThat();
        } finally {
            alwaysDoThis();
        }
        maybeDoTheOtherThing();
    }
}
