import models.Policy;
import models.User;
import models.actions.NotificationAction;
import models.events.SaleEvent;

public class SalePolicyTest {
    public static void main(String[] args) {
        SaleEvent[] saleEvents = new SaleEvent[1];
        saleEvents[0] = new SaleEvent(
                "SAS Supermarket",
                "Nestle Ice Cream",
                650.50
                );

        User receiver = new User("John", "Malkovich");

        NotificationAction[] notificationActions = new NotificationAction[1];
        notificationActions[0] = new NotificationAction(
                "We will deliver your product within 30 minutes.",
                receiver
        );

        Policy mySalePolicy = new Policy(
                "Sale Policy",
                "Applied when the clients buy some goods.",
                saleEvents,
                notificationActions
        );

        mySalePolicy.printOutput();
    }
}