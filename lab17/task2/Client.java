public class Client {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediator();

        ConcreteUser user1 = new ConcreteUser("User1", "admin", mediator);
        ConcreteUser user2 = new ConcreteUser("User2", "user", mediator);
        ConcreteUser user3 = new ConcreteUser("User3", "moderator", mediator);
        ConcreteUser user4 = new ConcreteUser("User4", "user", mediator);

        user1.sendMessageAll("Hello, everyone!");

        user2.sendMessage("Hello Admin!", "User1");

        user1.sendMessageToGroup("Admins meeting now!", "admin");
    }
}
