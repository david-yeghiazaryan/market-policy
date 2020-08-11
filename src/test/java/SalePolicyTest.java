import models.*;
import models.actions.NotificationAction;
import models.events.SaleEvent;
import models.policies.SalePolicy;

public class SalePolicyTest {
    public static void main(String[] args) {

        SaleEvent saleEvent = new SaleEvent(
                "SAS Supermarket",
                "Nestle Ice Cream",
                650.50
                );
        User receiver = new User("John", "Malkovich");
        NotificationAction notificationAction = new NotificationAction(
                "We will deliver your product within 30 minutes.",
                receiver
        );

        SalePolicy mySalePolicy = new SalePolicy(
                "Sale Policy",
                "Applied when the clients buy some goods.",
                saleEvent,
                notificationAction
        );

        System.out.println("------------------");
        System.out.println("Policy Name: " + mySalePolicy.getName());
        System.out.println("Description : " + mySalePolicy.getDescription());
        System.out.println("Policy ID: " + mySalePolicy.getId());

        System.out.println("Sale ID: " + mySalePolicy.getEvent().getId());
        System.out.println("Sale Date: " + mySalePolicy.getEvent().getDate());
        System.out.println("Sale Product Name: " + mySalePolicy.getEvent().getProductName());
        System.out.println("Sale Store Name: " + mySalePolicy.getEvent().getStoreName());
        System.out.println("Sale Item Price: " + mySalePolicy.getEvent().getPrice());


        System.out.println("Action ID: " + mySalePolicy.getAction().getId());
        System.out.println("Action Message: " + mySalePolicy.getAction().getMessage());
        System.out.println("Action Recipient: " + mySalePolicy.getAction().getUser().getFirstName()
                + " " + mySalePolicy.getAction().getUser().getLastName());
        System.out.println("------------------");
    }
}