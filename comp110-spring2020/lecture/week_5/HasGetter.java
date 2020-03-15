public class HasGetter {
    private int saved;

    public HasGetter(int x) {
        saved = x;
    }

    public int getSaved() {
        return saved;
    }

    public static void main(String[] args) {
        HasGetter g = new HasGetter(5);
        System.out.println(g.getSaved());
    }
}
