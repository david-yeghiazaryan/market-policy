package models.actions;

import models.User;

public class NotificationAction extends Action {
    private final String message;
    private final User user;

    public NotificationAction(String message, User user) {
        super();
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
