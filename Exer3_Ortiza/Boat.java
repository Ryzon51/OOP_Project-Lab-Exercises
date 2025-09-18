public class Boat extends WaterTransport {
    private int passengerCapacity;

    public Boat(String brand, String model, int maxSpeed, int passengerCapacity) {
        super(brand, model, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    public void boardPassengers() {
        System.out.println("Boarding " + passengerCapacity + " passengers on the " + brand + " " + model + " boat.");
    }
}
