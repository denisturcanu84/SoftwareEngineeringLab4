public class Notification {
    private String id;
    private String userId;
    private NotificationType type;
    private String content;
    private boolean isRead;
    private String createdAt;

    public Notification(String id, String userId, NotificationType type, String content) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.content = content;
        this.isRead = false;
        this.createdAt = java.time.LocalDateTime.now().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
