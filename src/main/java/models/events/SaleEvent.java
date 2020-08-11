package models.events;

public class SaleEvent extends Event {
    private final String storeName;
    private final String productName;
    private final double price;

    public SaleEvent(String aStoreName, String aProductName, double aPrice) {
        super();
        this.storeName = aStoreName;
        this.productName = aProductName;
        this.price = aPrice;
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
