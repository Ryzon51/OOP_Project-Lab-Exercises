public class LandTransport extends Transportation {
    protected int wheels;

    public LandTransport(String brand, String model, int wheels) {
        super(brand, model);
        this.wheels = wheels;
    }

    public void drive() {
        System.out.println("The " + brand + " " + model + " is driving.");
    }
}
