public class Product {
    protected String name;
    protected double price;
    protected int productId;

    public Product(String name, double price, int productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }

    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Product ID: " + productId);
    }
}
