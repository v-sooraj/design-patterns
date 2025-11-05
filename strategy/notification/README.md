# Notification System

This system provides a flexible, extensible, and efficient way to send notifications through multiple channels (Email, SMS, Push Notifications) for an e-commerce platform. It supports bulk notifications, retry logic, and status tracking.

## Key Concepts and Design

### 1. **Strategy Pattern**
- The system uses the **Strategy Pattern** to allow multiple notification channels (Email, SMS, Push).
- The `NotificationStrategy` interface defines the contract for all strategies. Concrete strategies (e.g., `EmailNotification`, `SMSNotification`, `PushNotification`) implement this interface.
- The design allows adding new notification types by creating new classes that implement the `NotificationStrategy` interface, without changing existing code.

### 2. **Bulk Notification Handling**
- Notifications are sent in **bulk** to multiple users. The `AdminService` class manages the orchestration and uses **concurrent execution** with the help of `ExecutorService`.
- Notifications are processed **in parallel**, allowing efficient handling of multiple users.

### 3. **Retry Logic (Exponential Backoff)**
- The system handles **failed notifications** using **exponential backoff**. If a notification fails, the system retries the operation with an increasing wait time (e.g., 1s, 2s, 4s).
- This approach helps manage transient failures (e.g., network issues or service downtime).

### 4. **Status Tracking**
- After each notification attempt, the system tracks whether it was **successfully sent** or **failed**.
- The status is logged, giving visibility into the outcome of each notification, which is useful for monitoring and debugging.

### 5. **Extensibility**
- The design is **extensible**; adding new notification channels requires only the implementation of the `NotificationStrategy` interface and doesn't require modifications to the core system logic.

### 6. **Concurrency and Performance**
- The system uses **ExecutorService** to manage parallel execution of tasks, ensuring efficient use of resources and faster delivery of notifications.
- The thread pool size is adjustable based on the number of users and expected workload.

### 7. **Error Handling and Logging**
- The system gracefully handles errors during notification dispatch by retrying failed notifications.
- Detailed logs are generated for each notification attempt, including success or failure status.

## System Architecture

- **AdminService**: Manages bulk notification processing, tracks users, and notification strategies.
- **NotificationStrategy** (Interface): Defines methods for sending notifications and checking their status.
- **Concrete Strategies** (EmailNotification, SMSNotification, PushNotification): Implement the `NotificationStrategy` interface, providing logic specific to each notification channel.
- **User**: Represents a user with contact details (email, phone, device token).

## Performance Considerations

- The system is designed to handle large user bases efficiently, with the use of concurrency to manage bulk notification delivery.
- Dynamic adjustments to the thread pool size can be made based on workload to ensure efficient resource utilization.

## Future Enhancements

- **Additional Notification Channels**: New notification strategies (e.g., Slack, Webhooks) can be added easily by implementing the `NotificationStrategy` interface.
- **Advanced Retry Logic**: More advanced retry mechanisms (e.g., exponential backoff with jitter) can be incorporated.
- **Logging and Monitoring**: Integration with a logging framework (e.g., SLF4J, Logback) for more advanced logging and monitoring capabilities.

---

## Class diagram

<img width="1131" height="493" alt="image" src="https://github.com/user-attachments/assets/564ff78a-0b30-4633-97b3-7bb68d692863" />
