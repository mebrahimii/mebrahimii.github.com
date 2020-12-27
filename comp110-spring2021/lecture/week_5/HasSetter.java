public class HasSetter {
    private int saved;

    public HasSetter(int x) {
        saved = x;
    }

    public void setSaved(int to) {
        saved = to;
    }

    public int getSaved() {
        return saved;
    }

    public static void main(String[] args) {
        HasSetter s = new HasSetter(5);
        s.setSaved(22);
        System.out.println(s.getSaved());
    }
}
