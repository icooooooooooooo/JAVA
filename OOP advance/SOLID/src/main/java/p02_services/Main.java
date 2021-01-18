package p02_services;

import p02_services.notifications.interfaces.NotificationService;
import p02_services.notifications.EmailNotificationService;
import p02_services.notifications.SmsNotificationService;

public class Main {
    public static void main(String[] args) {

        NotificationService emailNotification = new EmailNotificationService(true);
        NotificationService smsNotification = new SmsNotificationService(true);
        OnlineStoreOrder onlineStoreOrder = new OnlineStoreOrder(emailNotification, smsNotification);

        onlineStoreOrder.process();

    }
}
