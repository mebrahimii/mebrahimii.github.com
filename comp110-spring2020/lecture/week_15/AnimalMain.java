public class AnimalMain {
    public static void makeSpeak(CanBreathe cb) {
        // anything that implements the CanBreathe
        // interface has a speak() method
        cb.speak();
    }
    
    public static void makeFly(CanFly cf) {
        // anything that implements the CanFly
        // interface has a fly() method
        cf.fly();
    }
    
    public static void printName(Animal a) {
        System.out.println(a.getName());
    }
    
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Rover");
        Bat bat = new Bat("Billy");
        Parrot parrot = new Parrot("Polly");
        Spider spider = new Spider("Sarah");

        // as long as it implements CanBreathe, we can
        // pass it to makeSpeak
        makeSpeak(cat);
        makeSpeak(dog);
        makeSpeak(bat);
        makeSpeak(parrot);

        // as long as it implements CanFly, we can
        // pass it to makeFly
        makeFly(bat);
        makeFly(parrot);

        // only spiders can crawl
        spider.crawl();
    }
}


        
