package com.notify.admin;

import com.notify.strategy.NotificationStrategy;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public class AdminService {

    private List<NotificationStrategy> notificationStrategies;
    private List<User> users;

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setNotificationStrategies(List<NotificationStrategy> notificationStrategies) {
        this.notificationStrategies = notificationStrategies;
    }

    public void bulkNotify() throws RejectedExecutionException {
        if (!notificationStrategies.isEmpty() && !users.isEmpty()) {
            int numberOfThreads = Math.min(users.size(), 20); // Dynamic thread pool size
            ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

            notificationStrategies.forEach(notificationStrategy ->
                    users.forEach(user ->
                            executorService.submit(() -> notifyWithRetry(notificationStrategy, user))));

            // Initiating the shutdown of the executor service
            executorService.shutdown();  // No more tasks will be accepted

            // Wait for the termination of all tasks
            try {
                // Wait for up to 60 seconds for tasks to complete
                if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                    // If tasks haven't finished, forcefully shut down the service
                    executorService.shutdownNow();
                }
            } catch (InterruptedException e) {
                // If interrupted while waiting for tasks to finish, force shutdown immediately
                executorService.shutdownNow();
            }
        } else {
            throw new RejectedExecutionException("Execution rejected, notify strategies/users to notify not provided");
        }

    }

    private void notifyWithRetry(NotificationStrategy notificationStrategy, User user) {
        int retries = 3; // Max number of retries
        int backoff = 1;  // Initial backoff time in seconds
        while (retries > 0) {
            try {
                notificationStrategy.notifyUser(user, "Hello you are notified");
                showStatus(notificationStrategy.isSent(), user);
                break; // Exit loop on successful notification
            } catch (Exception e) {
                retries--;
                if (retries == 0) {
                    System.out.println("Error notifying user " + user.email() + ": " + e.getMessage());
                } else {
                    System.out.println("Error notifying user " + user.email() + ". Retrying in " + backoff + " seconds...");
                    try {
                        TimeUnit.SECONDS.sleep(backoff);  // Exponential backoff delay
                    } catch (InterruptedException interruptedException) {
                        Thread.currentThread().interrupt();  // Preserve interrupt flag
                    }
                    backoff *= 2;  // Double the backoff time for the next retry
                }
            }
        }
    }

    private void showStatus(boolean isSent, User user) {
        if (isSent && user != null) {
            System.out.println("Email notification sent successfully for user: " + user.email());
        } else {
            System.out.println("Email notification failed for user: " + (user != null ? user.email() : "Unknown"));
        }
    }

}
