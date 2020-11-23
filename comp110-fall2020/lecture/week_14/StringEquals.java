public class StringEquals {
    public static String concat(String s1, String s2) {
        return s1 + s2;
    }
    
    public static void main(String[] args) {
        String s1 = "foobar";
        String s2 = concat("foo", "bar");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

        
