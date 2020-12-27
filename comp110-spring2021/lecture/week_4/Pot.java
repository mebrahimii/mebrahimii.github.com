public class Pot {
    // begin instance variables
    int id;          // arbitrary numeric id (just for this example)
    Water contains; // water this pot contains
    // end instance variables

    public Pot(int initialId) {
        id = initialId;
        System.out.println("Creating pot with ID: " + id);
    }

    public void fillWith(Water water) {
        contains = water;
        System.out.println("Pot with ID " +
                           id +
                           " is filled with water with ID " +
                           contains.id);
    }

    public void heatApplied() {
        System.out.println("Pot with ID " +
                           id +
                           " has heat applied");
        contains.heatApplied();
    }
}
