package p02_services.notifications;

import p02_services.notifications.BaseNotification;

public class SmsNotificationService extends BaseNotification {


    public SmsNotificationService(boolean isActive) {
        super.isActive = isActive;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sms sent");

    }
}
