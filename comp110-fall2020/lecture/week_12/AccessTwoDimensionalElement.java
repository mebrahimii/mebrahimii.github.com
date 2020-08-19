public class AccessTwoDimensionalElement {
    public static void main(String[] args) {
        double[][] table = new double[][]{ new double[]{ 1.1, 8.7, 2.9 },
                                           new double[]{ 6.7, 2.3, 3.2 },
                                           new double[]{ 9.0, 5.6, 1.0 } };
        int rowNumber = Integer.parseInt(args[0]);
        int columnNumber = Integer.parseInt(args[1]);
        double[] row = table[rowNumber];
        double element = row[columnNumber];

        System.out.println("Element: " + element);

        System.out.println("All at once: " + table[rowNumber][columnNumber]);
    }
}
