public class Mammal {
    private String myName;

    public Mammal(String name) {
        myName = name;
    }

    public String getName() {
        return myName;
    }
    
    public void breathe() {
        System.out.println(myName + " the mammal takes a breath");
    }
}
