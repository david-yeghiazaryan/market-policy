package models.actions;

public class TrackingAction extends Action {
    private final String[] comments;

    public TrackingAction(String[] comments) {
        super();
        this.comments = comments;
    }

    public String[] getComments () {
        return comments;
    }
}
