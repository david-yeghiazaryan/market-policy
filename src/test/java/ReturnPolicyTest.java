import models.Policy;
import models.User;
import models.actions.NotificationAction;
import models.events.ReturnEvent;

public class ReturnPolicyTest {
    public static void main(String[] args) {
        ReturnEvent[] returnEvents = new ReturnEvent[1];
        returnEvents[0] = new ReturnEvent("The quality was bad.");

        User receiver = new User("David", "Yeghiazaryan");

        NotificationAction[] notificationActions = new NotificationAction[1];
        notificationActions[0] = new NotificationAction(
                "Please wrap the item, and send it back to our warehouse.",
                receiver
        );

        Policy myReturnPolicy = new Policy(
                "Return Policy",
                "Applied when the goods do not satisfy clients' needs.",
                returnEvents,
                notificationActions
        );

        myReturnPolicy.printOutput();
    }
}
