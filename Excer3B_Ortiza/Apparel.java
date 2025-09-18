public class Apparel extends PhysicalProduct {
    private String size;

    public Apparel(String name, double price, int productId, double weight, String size) {
        super(name, price, productId, weight);
        this.size = size;
    }

    public void tryOn() {
        System.out.println("Trying on " + name + " of size " + size);
    }
}
