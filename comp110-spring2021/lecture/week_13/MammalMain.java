public class MammalMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Rover");

        // Cat and Dog do not explicitly define
        // the breathe method.  However, they
        // both inherit breathe when they extend
        // from Mammal.
        cat.breathe();
        dog.breathe();

        // We can also call methods which are
        // specific to Dogs and Cats
        cat.meow();
        dog.bark();
    }
}
