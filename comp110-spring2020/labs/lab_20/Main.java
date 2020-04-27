// DO NOT MODIFY THIS FILE!
public class Main {
    public static void testCanBreathe(CanBreathe b) {
        b.breathe();
        b.speak();
    }

    public static void testCanCrawl(CanCrawl c) {
        c.crawl();
    }
    
    public static void testCanFly(CanFly f) {
        f.fly();
    }

    public static void testMammal(Mammal m) {}

    public static void testBug(Bug b) {}

    
    public static void main(String[] args) {
        Baby baby = new Baby("Bobby");
        Bee bee = new Bee("Bea");
        Spider spider = new Spider("Sally");

        testCanBreathe(baby);

        testCanCrawl(baby);
        testCanCrawl(bee);
        testCanCrawl(spider);

        testCanFly(bee);

        testMammal(baby);

        testBug(bee);
        testBug(spider);
    }
}
