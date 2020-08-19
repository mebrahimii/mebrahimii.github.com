public class Stove {
    // begin instance variables
    int id;    // arbitrary numeric id (just for this example)
    Pot onTop; // item on top of the stove
    // end instance variables
    
    public Stove(int initialId) {
        id = initialId;
        System.out.println("Creating stove with ID " + id);
    }

    public void placeOnTop(Pot pot) {
        onTop = pot;
        System.out.println("Pot with ID " +
                           onTop.id +
                           " is now on top of stove with ID " +
                           id);
    }

    public void turnOnBurner() {
        System.out.println("Turning on burner of stove with ID " +
                           id);
        onTop.heatApplied();
    }
}
