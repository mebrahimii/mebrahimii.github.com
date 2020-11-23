public class CustomEquals {
    private int x;

    public CustomEquals(int x) {
        this.x = x;
    }

    public boolean equals(Object other) {
        if (other instanceof CustomEquals) {
            CustomEquals ce = (CustomEquals)other;

            // even though this is another object, because
            // it's a member of this class (CustomEquals),
            // we can access private things on the instance
            return x == ce.x;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        CustomEquals holds5 = new CustomEquals(5);
        CustomEquals alsoHolds5 = new CustomEquals(5);
        CustomEquals holds7 = new CustomEquals(7);

        System.out.println("holds5 == holds5: " +
                           (holds5 == holds5));
        System.out.println("holds5 == alsoHolds5: " +
                           (holds5 == alsoHolds5));
        System.out.println("holds5 == holds7: " +
                           (holds5 == holds7));

        System.out.println("holds5.equals(holds5): " +
                           holds5.equals(holds5));
        System.out.println("holds5.equals(alsoHolds5): " +
                           holds5.equals(alsoHolds5));
        System.out.println("holds5.equals(holds7): " +
                           holds5.equals(holds7));
    }
}
        
