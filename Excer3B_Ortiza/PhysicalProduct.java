public class PhysicalProduct extends Product {
    protected double weight;

    public PhysicalProduct(String name, double price, int productId, double weight) {
        super(name, price, productId);
        this.weight = weight;
    }

    public void ship() {
        System.out.println("Shipping " + name + " (" + weight + " kg)");
    }
}
