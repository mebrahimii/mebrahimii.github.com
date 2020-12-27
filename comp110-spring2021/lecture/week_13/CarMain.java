public class CarMain {
    public static void main(String[] args) {
        Car c1 = new SportsCar();
        Car c2 = new SemiTruck();

        System.out.println("Sports car:");
        c1.goUpAndDownHill();

        System.out.println("\n\nSemi truck:");
        c2.goUpAndDownHill();
    }
}
