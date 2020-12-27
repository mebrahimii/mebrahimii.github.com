public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(getName() + " the cat meows");
    }
}
