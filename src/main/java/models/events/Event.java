package models.events;

import java.time.LocalDate;

import models.Base;

public abstract class Event extends Base {
    private final LocalDate date = LocalDate.now();

    public Event() {
        super();
    }

    public LocalDate getDate() {
        return date;
    }
}
