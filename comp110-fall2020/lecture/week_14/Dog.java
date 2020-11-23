public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void speak() {
        printWithHeader("barks");
    }

    public String animalType() {
        return "dog";
    }
}
