package models;

import models.events.Event;
import models.actions.Action;

public class Policy extends Base {
    private final Event[] events;
    private final Action[] actions;
    private final String name;
    private final String description;

    public Policy(String name, String description, Event[] events, Action[] actions) {
        super();
        this.name = name;
        this.description = description;
        this.events = events;
        this.actions = actions;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Event[] getEvents() {
        return events;
    }

    public Action[] getActions() {
        return actions;
    }

    public void printOutput() {
        System.out.println("------------------");
        System.out.println("Policy Name: " + getName());
        System.out.println("Description : " + getDescription());
        System.out.println("Policy ID: " + getId());
        System.out.println("------------------");
    }

    ;
}