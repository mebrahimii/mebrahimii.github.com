// DO NOT MODIFY ANYTHING IN THIS FILE!!

public class CircleMain {
    public static void checkRadiusOk(double expectedRadius, Circle circle) {
        double haveRadius = circle.getRadius();
        if (haveRadius != expectedRadius) {
            System.out.println("Radius mismatch!  Expected: " +
                               expectedRadius + " ...but we have: " +
                               haveRadius);
        }
    }
    
    public static void main(String[] args) {
        double initialRadius = Double.parseDouble(args[0]);
        double resetRadius = Double.parseDouble(args[1]);
        
        Circle dyn = new CircleDynamicArea(initialRadius);
        Circle pre = new CirclePrecomputedArea(initialRadius);

        checkRadiusOk(initialRadius, dyn);
        checkRadiusOk(initialRadius, pre);
        
        double initialDynArea = dyn.getArea();
        double initialPreArea = pre.getArea();
        
        System.out.println("Initial dynamic area: " + initialDynArea);
        System.out.println("Initial precomputed area: " + initialPreArea);

        if (initialDynArea != initialPreArea) {
            System.out.println("Areas don't match initially");
        } else {
            dyn.setRadius(resetRadius);
            pre.setRadius(resetRadius);

            checkRadiusOk(resetRadius, dyn);
            checkRadiusOk(resetRadius, pre);
            
            double resetDynArea = dyn.getArea();
            double resetPreArea = pre.getArea();
            System.out.println("Reset dynamic area: " + resetDynArea);
            System.out.println("Reset precomputed area: " + resetPreArea);

            if (resetDynArea != resetPreArea) {
                System.out.println("Areas don't match after resetting the radius");
            }
        }
    }
}
