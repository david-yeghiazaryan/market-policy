package models.policies;

import models.events.ReturnEvent;
import models.actions.NotificationAction;

public class ReturnPolicy extends Policy {
    private final ReturnEvent event;
    private final NotificationAction action;

    public ReturnPolicy(String name, String description, ReturnEvent event, NotificationAction action) {
        super(name, description);
        this.event = event;
        this.action = action;
    }

    @Override
    public ReturnEvent getEvent() {
        return event;
    }

    @Override
    public NotificationAction getAction() {
        return action;
    }
}
