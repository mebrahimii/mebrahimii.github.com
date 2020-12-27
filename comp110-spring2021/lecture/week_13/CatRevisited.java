public class CatRevisited extends MammalRevisited {
    public CatRevisited(String name) {
        super(name);
    }

    public String mammalType() {
        return "cat";
    }
    
    public void speak() {
        System.out.println(getName() + " the cat meows");
    }
}
