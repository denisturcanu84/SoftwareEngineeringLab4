import java.util.List;

public class Main {
    public static void main(String[] args) {
        String userId = "user1";

        WishlistService wishlist = new WishlistService("123");

        wishlist.addItem("Book");
        wishlist.addItem("Headphones");

        System.out.println("\n Wishlist ");
        wishlist.showWishlist();

        NotificationRepository notificationRepo = new NotificationRepository();

        Notification notification1 = new Notification("n1", userId, NotificationType.INVITATION,
                "invitation");
        Notification notification2 = new Notification("n2", userId, NotificationType.UPDATE,
                "update 1");
        Notification notification3 = new Notification("n3", userId, NotificationType.CONFIRMATION,
                "confirmation1");

        notificationRepo.saveNotification(notification1);
        notificationRepo.saveNotification(notification2);
        notificationRepo.saveNotification(notification3);

        System.out.println("\nnotifications ");
        List<Notification> userNotifications = notificationRepo.getNotificationsByUserId(userId);
        for (Notification notification : userNotifications) {
            System.out.println(notification.getType() + ": " + notification.getContent());
        }
    }
}