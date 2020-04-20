public abstract class Car {
    public abstract void accelerate();
    public abstract void brake();

    // Key point: this can be defined without knowing exactly
    // how accelerate() and brake() work.  Exactly how these
    // work is left up to subclasses.  Each subclass can define
    // its own way to accelerate and brake
    public void goUpAndDownHill() {
        System.out.println("---Going uphill---");
        accelerate();
        System.out.println("---Going downhill---");
        brake();
    }
}
