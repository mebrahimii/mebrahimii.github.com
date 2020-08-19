public class Faucet {
    // begin instance variables
    int id; // arbitrary numeric id (just for this example)
    // end instance variables
    
    public Faucet(int initialId) {
        id = initialId;
        System.out.println("Creating faucet with ID " + id);
    }

    public void fillPotWithWater(Pot pot, int waterId) {
        System.out.println("Faucet with ID " +
                           id +
                           " is filling pot with ID " +
                           pot.id);
        Water water = produceWaterWithId(waterId);
        pot.fillWith(water);
    }
    
    public Water produceWaterWithId(int waterId) {
        System.out.println("Faucet with ID " +
                           id +
                           " is producing water with ID " +
                           waterId);
        return new Water(waterId);
    }
}
