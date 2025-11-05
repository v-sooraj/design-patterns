package com.notify.notifications;

import com.notify.admin.User;
import com.notify.strategy.NotificationStrategy;

public class PushNotification implements NotificationStrategy {

    private boolean isSent;

    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Push notification sent: "+ message);
        System.out.println("User device token:" + user.deviceToken());
        isSent = true;

    }

    @Override
    public boolean isSent() {
        return isSent;
    }
}
