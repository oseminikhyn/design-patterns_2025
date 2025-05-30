import java.util.HashMap;
import java.util.Map;

public class ChatMediator {
    private final Map<String, User> users = new HashMap<>();

    public void registerUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void sendMessageToAll(String message, String fromUserId) {
        for (User user : users.values()) {
            if (!user.getUserId().equals(fromUserId)) {
                user.receiveMassage(message, fromUserId);
            }
        }
    }

    public void sendMessageToUser(String message, String fromUserId, String toUserId) {
        User user = users.get(toUserId);
        if (user != null) {
            user.receiveMassage(message, fromUserId);
        }
    }

    public void sendMessageToGroup(String message, String fromUserId, String group) {
        for (User user : users.values()) {
            if (!user.getUserId().equals(fromUserId) && user.getGroup().equals(group)) {
                user.receiveMassage(message, fromUserId);
            }
        }
    }
}