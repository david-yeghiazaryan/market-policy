package models.policies;

import models.actions.TrackingAction;
import models.events.DeliveryEvent;

public class DeliveryPolicy extends Policy {
    private final DeliveryEvent event;
    private final TrackingAction action;

    public DeliveryPolicy(String name, String description, DeliveryEvent event, TrackingAction action) {
        super(name, description);
        this.event = event;
        this.action = action;
    }

    @Override
    public DeliveryEvent getEvent() {
        return event;
    }

    @Override
    public TrackingAction getAction() {
        return action;
    }
}
