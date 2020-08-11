package models;

import models.events.Event;
import models.actions.Action;

public class Policy extends Base {
    private final String name;
    private final String description;
    private final Event event;
    private final Action action;

    public Policy(String name, String description, Event event, Action action) {
        super();
        this.name = name;
        this.description = description;
        this.event = event;
        this.action = action;
    }

    public Event getEvent() {
        return event;
    }

    public Action getAction() {
        return action;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}