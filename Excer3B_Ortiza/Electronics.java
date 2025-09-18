public class Electronics extends PhysicalProduct {
    private int warrantyYears;

    public Electronics(String name, double price, int productId, double weight, int warrantyYears) {
        super(name, price, productId, weight);
        this.warrantyYears = warrantyYears;
    }

    public void activateWarranty() {
        System.out.println("Activating " + warrantyYears + "-year warranty for " + name);
    }
}
