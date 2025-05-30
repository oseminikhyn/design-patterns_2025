public interface User {
    void sendMessageAll(String message);
    void sendMessage(String message, String userTo);
    void sendMessageToGroup(String message, String group);
    void receiveMassage(String message, String userFrom);
    String getUserId();
    String getGroup();
}