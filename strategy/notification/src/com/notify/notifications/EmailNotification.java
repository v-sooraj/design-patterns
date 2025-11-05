package com.notify.notifications;

import com.notify.admin.User;
import com.notify.strategy.NotificationStrategy;

public class EmailNotification implements NotificationStrategy {

    private boolean isSent;

    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Email notification: "+ message);
        System.out.println("User email:" + user.email());
        isSent = true;
    }

    @Override
    public boolean isSent() {
        return isSent;
    }

}
