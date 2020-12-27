public class BoilingWater {
    public static void main(String[] args) {
        Faucet faucet = new Faucet(0);
        Pot pot = new Pot(1);
        Stove stove = new Stove(2);
        faucet.fillPotWithWater(pot, 3);
        stove.placeOnTop(pot);
        stove.turnOnBurner();
    }
}
