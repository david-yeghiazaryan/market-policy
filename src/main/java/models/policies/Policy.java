package models.policies;

import models.Base;
import models.events.Event;
import models.actions.Action;

public abstract class Policy extends Base {
    private final String name;
    private final String description;

    public Policy(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public abstract Event getEvent();

    public abstract Action getAction();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}