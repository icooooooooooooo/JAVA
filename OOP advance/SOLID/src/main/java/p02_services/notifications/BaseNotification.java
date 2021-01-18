package p02_services.notifications;

import p02_services.notifications.interfaces.NotificationService;

public abstract class BaseNotification implements NotificationService {

    protected boolean isActive;

    @Override
    public boolean isActive() {
        return this.isActive;
    }

}
