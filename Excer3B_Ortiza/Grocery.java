public class Grocery extends PhysicalProduct {
    private String expirationDate;

    public Grocery(String name, double price, int productId, double weight, String expirationDate) {
        super(name, price, productId, weight);
        this.expirationDate = expirationDate;
    }

    public void checkExpiry() {
        System.out.println(name + " expires on " + expirationDate);
    }
}
