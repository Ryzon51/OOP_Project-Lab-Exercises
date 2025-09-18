public class Furniture extends PhysicalProduct {
    private String material;

    public Furniture(String name, double price, int productId, double weight, String material) {
        super(name, price, productId, weight);
        this.material = material;
    }

    public void assemble() {
        System.out.println("Assembling " + name + " made of " + material);
    }
}
