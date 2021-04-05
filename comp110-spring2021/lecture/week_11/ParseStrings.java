public class ParseStrings {
    public static int[] parseStrings(String[] strings) {
        int[] retval = new int[strings.length];
        for (int x = 0; x < strings.length; x++) {
            retval[x] = Integer.parseInt(strings[x]);
        }
        return retval;
    }
}
        
