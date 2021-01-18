package p02_services.notifications;

public class EmailNotificationService extends BaseNotification {


    public EmailNotificationService(boolean isActive) {
        super.isActive = isActive;
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent");
    }

}
