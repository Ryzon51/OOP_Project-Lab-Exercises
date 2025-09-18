public class Truck extends LandTransport {
    private int cargoCapacity;

    public Truck(String brand, String model, int wheels, int cargoCapacity) {
        super(brand, model, wheels);
        this.cargoCapacity = cargoCapacity;
    }

    public void loadCargo() {
        System.out.println("Loading cargo into the " + brand + " " + model + " with " + cargoCapacity + " tons capacity.");
    }
}
