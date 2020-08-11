package models.events;

public class ReturnEvent extends Event {
    private final String reason;

    public ReturnEvent(String aReason) {
        super();
        this.reason = aReason;
    }

    public String getReason() {
        return reason;
    }
}
