public class Helicopter extends AirTransport {
    private int rotorDiameter;

    public Helicopter(String brand, String model, int maxAltitude, int rotorDiameter) {
        super(brand, model, maxAltitude);
        this.rotorDiameter = rotorDiameter;
    }

    public void hover() {
        System.out.println("The " + brand + " " + model + " is hovering with a rotor diameter of " + rotorDiameter + " feet.");
    }
}
