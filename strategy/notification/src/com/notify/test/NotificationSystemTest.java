package com.notify.test;

import com.notify.admin.AdminService;
import com.notify.admin.User;
import com.notify.notifications.EmailNotification;
import com.notify.notifications.PushNotification;
import com.notify.notifications.SMSNotification;

import java.util.List;
import java.util.concurrent.RejectedExecutionException;

public class NotificationSystemTest {

    public static void main(String[] args) {

        AdminService admin = new AdminService();
        admin.setNotificationStrategies(List.of(new EmailNotification(), new SMSNotification(), new PushNotification()));
        admin.setUsers(List.of(new User("user1@abc.com", "123", "zGAd"), new User("user2@abc.com", "456", "DjdH")));
        try {
            admin.bulkNotify();
        } catch (RejectedExecutionException re) {
            System.out.println(re.getMessage());
        }

    }
}
