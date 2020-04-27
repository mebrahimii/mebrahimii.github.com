// DO NOT MODIFY THIS FILE!
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void printWithHeader(String what) {
        System.out.println(name + " the " +
                           animalType() + " " + what);
    }

    public boolean equals(Object other) {
        if (other != null && other instanceof Animal) {
            Animal otherAnimal = (Animal)other;
            return (name.equals(otherAnimal.getName()) &&
                    animalType().equals(otherAnimal.animalType()));
        } else {
            return false;
        }
    }
                
    public abstract String animalType();
}
