package models.policies;

import models.actions.NotificationAction;
import models.events.SaleEvent;

public class SalePolicy extends Policy {
    private final SaleEvent event;
    private final NotificationAction action;

    public SalePolicy(String name, String description, SaleEvent event, NotificationAction action) {
        super(name, description);
        this.event = event;
        this.action = action;
    }

    @Override
    public SaleEvent getEvent() {
        return event;
    }

    @Override
    public NotificationAction getAction() {
        return action;
    }
}
