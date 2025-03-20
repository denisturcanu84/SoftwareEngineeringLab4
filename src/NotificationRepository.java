import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NotificationRepository {
    private final List<Notification> notifications = new ArrayList<>();

    public void saveNotification(Notification notification) {
        notifications.add(notification);
        System.out.println("notif save: " + notification.getId());
    }

    public List<Notification> getNotificationsByUserId(String userId) {
        return notifications.stream()
                .filter(n -> n.getUserId().equals(userId))
                .collect(Collectors.toList());
    }

    public void markAsRead(String notificationId) {
        notifications.stream()
                .filter(n -> n.getId().equals(notificationId))
                .findFirst()
                .ifPresent(n -> n.setRead(true));
        System.out.println("notif read: " + notificationId);
    }
}