import models.Policy;
import models.actions.TrackingAction;
import models.events.DeliveryEvent;

public class DeliveryPolicyTest {
    public static void main(String[] args) {
        DeliveryEvent.Type freeDelivery = DeliveryEvent.Type.FREE;
        DeliveryEvent.Type paidDelivery = DeliveryEvent.Type.PAID;

        DeliveryEvent[] deliveryEvents = new DeliveryEvent[2];
        deliveryEvents[0] = new DeliveryEvent("Tumanyan str. 95, 24 apt.", freeDelivery);
        deliveryEvents[1] = new DeliveryEvent("Mashtots str. 42, 45 apt.", paidDelivery);

        String[] comments = new String[2];

        comments[0] = "Please deliver faster.";
        comments[1] = "The entrance code is 1234";

        TrackingAction[] trackingActions = new TrackingAction[1];
        trackingActions[0] = new TrackingAction(comments);

        Policy myDeliveryPolicy = new Policy(
                "Delivery Policy",
                "Applied when the clients have bought some goods, and they need to be delivered.",
                deliveryEvents,
                trackingActions
        );

        myDeliveryPolicy.printOutput();
    }
}
