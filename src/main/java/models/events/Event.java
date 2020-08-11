package models.events;

import java.time.LocalDate;

import models.Base;

public class Event extends Base {
    private final LocalDate date;

    public Event() {
        super();
        date = LocalDate.now();
    }

    public LocalDate getDate() {
        return date;
    }
}
