    public class SUV extends LandTransport {
    private int seatingCapacity;

    public SUV(String brand, String model, int wheels, int seatingCapacity) {
        super(brand, model, wheels);
        this.seatingCapacity = seatingCapacity;
    }

    public void offroad() {
        System.out.println("The " + brand + " " + model + " is going off-road with " + seatingCapacity + " seats.");
    }
}
