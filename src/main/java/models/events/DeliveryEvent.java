package models.events;

public class DeliveryEvent extends Event{
    public enum Type {
        FREE,
        PAID
    }

    private final String addressName;
    private final Type type;

    public DeliveryEvent(String addressName, Type aType) {
        super();
        this.addressName = addressName;
        this.type = aType;
    }

    public String getAddressName() {
        return addressName;
    }

    public Type getType() {
        return type;
    }
}
