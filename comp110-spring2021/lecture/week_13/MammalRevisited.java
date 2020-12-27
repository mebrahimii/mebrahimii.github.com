public abstract class MammalRevisited {
    private String myName;

    public MammalRevisited(String name) {
        myName = name;
    }

    public String getName() {
        return myName;
    }

    public void breathe() {
        System.out.println(myName + " the " +
                           mammalType() + " takes a breath");
    }

    public abstract String mammalType();
    public abstract void speak();
}
