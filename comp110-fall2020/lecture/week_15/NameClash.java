public class NameClash {
    private int x;

    public NameClash(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        NameClash nc = new NameClash(7);
        System.out.println(nc.getX());
    }
}
