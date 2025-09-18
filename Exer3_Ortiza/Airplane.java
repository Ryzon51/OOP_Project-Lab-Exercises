public class Airplane extends AirTransport {
    private int passengerCapacity;

    public Airplane(String brand, String model, int maxAltitude, int passengerCapacity) {
        super(brand, model, maxAltitude);
        this.passengerCapacity = passengerCapacity;
    }

    public void boardPassengers() {
        System.out.println("Boarding " + passengerCapacity + " passengers on the " + brand + " " + model + ".");
    }
}
