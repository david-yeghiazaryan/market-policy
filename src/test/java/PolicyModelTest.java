import models.*;
import models.actions.NotificationAction;
import models.actions.TrackingAction;
import models.events.Event;
import models.events.ReturnEvent;
import models.events.DeliveryEvent;
import models.events.SaleEvent;

public class PolicyModelTest {
    public static void main(String[] args) {

        User receiver = new User("David", "Yeghiazaryan");

        DeliveryEvent.Type freeDelivery = DeliveryEvent.Type.FREE;
        DeliveryEvent.Type paidDelivery = DeliveryEvent.Type.PAID;

        ReturnEvent returnEvent = new ReturnEvent("The quality was bad.");
        DeliveryEvent deliveryEvent = new DeliveryEvent("Tumanyan 8", freeDelivery);
        SaleEvent saleEvent = new SaleEvent("SAS", "Ice Cream", 449.99);

        NotificationAction notificationAction = new NotificationAction(
                "We're en route.",
                receiver
        );

        String[] comments = new String[2];

        comments[0] = "Please deliver faster.";
        comments[1] = "The entrance code is 1234";

        TrackingAction trackingAction = new TrackingAction(comments);

        Policy salePolicy = new Policy(
                "Sale Policy",
                "Applied when the clients buy some goods.",
                saleEvent,
                notificationAction
        );

        Policy deliveryPolicy = new Policy(
                "Delivery Policy",
                "Applied when the clients have bought some goods, and they need to be delivered.",
                deliveryEvent,
                trackingAction
        );

        Policy returnPolicy = new Policy(
                "Return Policy",
                "Applied when the goods do not satisfy clients' needs.",
                returnEvent,
                notificationAction
        );

        Policy[] policies = new Policy[3];

        policies[0] = salePolicy;
        policies[1] = deliveryPolicy;
        policies[2] = returnPolicy;

        if (deliveryPolicy.getEvent() instanceof DeliveryEvent) {
            DeliveryEvent deliveryPolicyEvent = (DeliveryEvent) deliveryPolicy.getEvent();
            System.out.println(deliveryPolicyEvent.getType());
        }

        for (Policy p : policies) {
            System.out.println("------------------");
            System.out.println("Policy Name: " + p.getName());
            System.out.println("Description : " + p.getDescription());
            System.out.println("Policy ID: " + p.getId());

            System.out.println("Event date: " + p.getEvent().getDate());
            System.out.println("Event ID: " + p.getEvent().getId());

            System.out.println("Action ID: " + p.getAction().getId());
            System.out.println("------------------");
        }
    }
}