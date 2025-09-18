public class Submarine extends WaterTransport {
    private int depthRating;

    public Submarine(String brand, String model, int maxSpeed, int depthRating) {
        super(brand, model, maxSpeed);
        this.depthRating = depthRating;
    }

    public void dive() {
        System.out.println("The " + brand + " " + model + " is diving to a depth of " + depthRating + " meters.");
    }
}
