public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void speak() {
        printWithHeader("meows");
    }

    public String animalType() {
        return "cat";
    }
}
