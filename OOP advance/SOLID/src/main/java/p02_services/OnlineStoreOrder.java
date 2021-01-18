package p02_services;

import p02_services.notifications.interfaces.NotificationService;

public class OnlineStoreOrder {

    private NotificationService emailNotification;
    private NotificationService smsNotification;

    public OnlineStoreOrder(NotificationService emailNotificationService, NotificationService smsNotificationService) {
        this.emailNotification = emailNotificationService;
        this.smsNotification = smsNotificationService;
    }

    public void process() {
        if (this.smsNotification.isActive())
            this.smsNotification.sendNotification();

        if (this.emailNotification.isActive())
            this.emailNotification.sendNotification();
    }
}
