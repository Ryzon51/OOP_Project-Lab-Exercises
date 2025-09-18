public class WaterTransport extends Transportation {
    protected int maxSpeed;

    public WaterTransport(String brand, String model, int maxSpeed) {
        super(brand, model);
        this.maxSpeed = maxSpeed;
    }

    public void sail() {
        System.out.println("The " + brand + " " + model + " is sailing at " + maxSpeed + " knots.");
    }
}
