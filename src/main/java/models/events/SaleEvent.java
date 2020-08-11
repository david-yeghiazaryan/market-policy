package models.events;

public class SaleEvent extends Event {
    private final String storeName;
    private final String productName;
    private final double price;

    public SaleEvent(String storeName, String productName, double price) {
        super();
        this.storeName = storeName;
        this.productName = productName;
        this.price = price;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
