public class DogRevisited extends MammalRevisited {
    public DogRevisited(String name) {
        super(name);
    }

    public String mammalType() {
        return "dog";
    }
    
    public void speak() {
        System.out.println(getName() + " the dog barks");
    }
}
