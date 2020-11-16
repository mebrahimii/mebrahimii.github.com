public class MammalMainRevisited {
    public static void breatheAndSpeak(MammalRevisited m) {
        m.breathe();
        m.speak();
    }
    
    public static void main(String[] args) {
        MammalRevisited m1 = new CatRevisited("Tom");
        MammalRevisited m2 = new DogRevisited("Rover");

        breatheAndSpeak(m1);
        breatheAndSpeak(m2);
    }
}
