public class Water {
    // begin instance variables
    int id; // arbitrary numeric id (just for this example)
    // end instance variables

    public Water(int initialId) {
        id = initialId;
        System.out.println("Creating water with ID " + id);
    }

    public void heatApplied() {
        System.out.println("Water with ID " +
                           id +
                           " is boiling");
    }
}
