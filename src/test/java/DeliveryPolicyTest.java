import models.actions.TrackingAction;
import models.events.DeliveryEvent;
import models.policies.DeliveryPolicy;

import java.util.Arrays;

public class DeliveryPolicyTest {
    public static void main(String[] args) {
        DeliveryEvent.Type freeDelivery = DeliveryEvent.Type.FREE;
        DeliveryEvent.Type paidDelivery = DeliveryEvent.Type.PAID;

        DeliveryEvent deliveryEvent = new DeliveryEvent("Tumanyan str. 95, 24 apt.", freeDelivery);

        String[] comments = new String[2];

        comments[0] = "Please deliver faster.";
        comments[1] = "The entrance code is 1234";

        TrackingAction trackingAction = new TrackingAction(comments);

        DeliveryPolicy myDeliveryPolicy = new DeliveryPolicy(
                "Delivery Policy",
                "Applied when the clients have bought some goods, and they need to be delivered.",
                deliveryEvent,
                trackingAction
        );

        System.out.println("------------------");
        System.out.println("Policy Name: " + myDeliveryPolicy.getName());
        System.out.println("Description : " + myDeliveryPolicy.getDescription());
        System.out.println("Policy ID: " + myDeliveryPolicy.getId());

        System.out.println("Delivery ID: " + myDeliveryPolicy.getEvent().getId());
        System.out.println("Delivery Submitted On: " + myDeliveryPolicy.getEvent().getDate());
        System.out.println("Delivery Address: " + myDeliveryPolicy.getEvent().getAddressName());
        System.out.println("Delivery Type: " + myDeliveryPolicy.getEvent().getType());

        System.out.println("Tracking ID: " + myDeliveryPolicy.getAction().getId());
        System.out.println("Tracking Comments: " + Arrays.toString(myDeliveryPolicy.getAction().getComments()));
        System.out.println("------------------");
    }
}
