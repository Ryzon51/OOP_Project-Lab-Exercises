public class Transportation {
    protected String brand;
    protected String model;

    public Transportation(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("The " + brand + " " + model + " engine is starting.");
    }

    public void stopEngine() {
        System.out.println("The " + brand + " " + model + " engine is stopping.");
    }
}
