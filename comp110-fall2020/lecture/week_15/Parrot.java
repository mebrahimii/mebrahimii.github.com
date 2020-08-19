public class Parrot extends Animal implements CanBreathe, CanFly {
    public Parrot(String name) {
        super(name);
    }

    public void breathe() {
        printWithHeader("takes a breath");
    }

    public void fly() {
        printWithHeader("flaps its feathered wings");
    }

    public void speak() {
        printWithHeader("squawks");
    }

    public String animalType() {
        return "bird";
    }
}

