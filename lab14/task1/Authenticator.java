import java.util.Map;

public class Authenticator {

    private final Map<String, String> adminsAccounts;
    private final Map<String, String> usersAccounts;

    public Authenticator(Map<String, String> adminsAccounts, Map<String, String> usersAccounts) {
        this.adminsAccounts = adminsAccounts;
        this.usersAccounts = usersAccounts;
    }

    public boolean authenticate(Account account) {
        String login = account.getLogin();
        String password = account.getPassword();

        switch (account.getAccessType()) {
            case Guest:
                System.out.println("Guest access provided!");
                return true;

            case User:
                String userPassword = usersAccounts.get(login);
                if (password.equals(userPassword)) {
                    System.out.println("User access provided: " + login);
                    return true;
                }
                break;

            case Administrator:
                String adminPassword = adminsAccounts.get(login);
                if (password.equals(adminPassword) && password.length() >= 8) {
                    System.out.println("Administrator access provided: " + login);
                    return true;
                }
                break;
        }

        System.out.println("Access denied: " + login);
        return false;
    }
}