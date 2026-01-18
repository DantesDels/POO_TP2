public class NotificationService {

    private final MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void envoyer(String message) {
        if (sender != null) {
            sender.send(message);
        }
    }
}