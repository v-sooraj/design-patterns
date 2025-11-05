package com.notify.strategy;

import com.notify.admin.User;

public interface NotificationStrategy {
    void notifyUser(User user, String message);
    boolean isSent();
}
