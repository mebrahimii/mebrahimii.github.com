// DO NOT MODIFY THIS FILE!
public abstract class Mammal extends Animal implements CanBreathe {
    public Mammal(String name) {
        super(name);
    }

    public void breathe() {
        printWithHeader("takes a breath");
    }
}
