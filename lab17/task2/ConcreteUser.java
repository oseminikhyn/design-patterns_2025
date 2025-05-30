public class ConcreteUser implements User {

    private final String userId;
    private final String group;
    private ChatMediator mediator;

    public ConcreteUser(String userId, String group, ChatMediator mediator) {
        this.userId = userId;
        this.group = group;
        this.mediator = mediator;
        mediator.registerUser(this);
    }

    @Override
    public void sendMessageAll(String message) {
        mediator.sendMessageToAll(message, userId);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        mediator.sendMessageToUser(message, userId, userTo);
    }

    @Override
    public void sendMessageToGroup(String message, String group) {
        mediator.sendMessageToGroup(message, userId, group);
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: '" + message + "' from " + userFrom);
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public String getGroup() {
        return group;
    }
}