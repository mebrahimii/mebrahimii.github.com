public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " the dog barks");
    }
}
