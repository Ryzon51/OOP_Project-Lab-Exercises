public class DigitalProduct extends Product {
    private double fileSize;

    public DigitalProduct(String name, double price, int productId, double fileSize) {
        super(name, price, productId);
        this.fileSize = fileSize;
    }

    public void download() {
        System.out.println("Downloading " + name + " (" + fileSize + " GB)");
    }
}
