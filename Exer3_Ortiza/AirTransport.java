public class AirTransport extends Transportation {
    protected int maxAltitude;

    public AirTransport(String brand, String model, int maxAltitude) {
        super(brand, model);
        this.maxAltitude = maxAltitude;
    }

    public void fly() {
        System.out.println("The " + brand + " " + model + " is flying at " + maxAltitude + " feet.");
    }
}
