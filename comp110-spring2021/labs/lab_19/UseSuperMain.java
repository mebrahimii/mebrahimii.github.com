// DO NOT MODIFY ANYTHING IN THIS FILE!!

public class UseSuperMain {
    public static void main(String[] args) {
        long seed = Long.parseLong(args[0]);
        int high = Integer.parseInt(args[1]);
        int addThis = Integer.parseInt(args[2]);

        UseSuperBase base = new UseSuperBase(seed);
        UseSuperSub sub = new UseSuperSub(seed, addThis);

        if (base.nextInt(high) + addThis != sub.nextInt(high)) {
            System.out.println("Mismatch!");
        } else {
            System.out.println("All ok");
        }
    }
}
