public class Bat extends Mammal implements CanFly {
    public Bat(String name) {
        super(name);
    }

    public void speak() {
        printWithHeader("squeaks");
    }

    public void fly() {
        printWithHeader("flaps its webbed wings");
    }

    public String animalType() {
        return "bat";
    }
}
