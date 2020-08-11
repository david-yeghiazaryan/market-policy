import models.*;
import models.actions.NotificationAction;
import models.events.ReturnEvent;
import models.policies.ReturnPolicy;

public class ReturnPolicyTest {
    public static void main(String[] args) {

        ReturnEvent returnEvent = new ReturnEvent("The quality was bad.");
        User receiver = new User("David", "Yeghiazaryan");
        NotificationAction notificationAction = new NotificationAction(
                "Please wrap the item, and send it back to our warehouse.",
                receiver
        );

        ReturnPolicy myReturnPolicy = new ReturnPolicy(
                "Return Policy",
                "Applied when the goods do not satisfy clients' needs.",
                returnEvent,
                notificationAction
        );

        System.out.println("------------------");
        System.out.println("Policy Name: " + myReturnPolicy.getName());
        System.out.println("Description : " + myReturnPolicy.getDescription());
        System.out.println("Policy ID: " + myReturnPolicy.getId());

        System.out.println("Return ID: " + myReturnPolicy.getEvent().getId());
        System.out.println("Return Submitted On: " + myReturnPolicy.getEvent().getDate());
        System.out.println("Return Reason: " + myReturnPolicy.getEvent().getReason());


        System.out.println("Notification ID: " + myReturnPolicy.getAction().getId());
        System.out.println("Notification Message: " + myReturnPolicy.getAction().getMessage());
        System.out.println("Notification Recipient: " + myReturnPolicy.getAction().getUser().getFirstName()
                + " " + myReturnPolicy.getAction().getUser().getLastName());
        System.out.println("------------------");
    }
}
