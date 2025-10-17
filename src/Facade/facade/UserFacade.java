package Facade.facade;

import Facade.components.*;

public class UserFacade {
    private final UserDatabase database = new UserDatabase();
    private final Logger logger = new Logger();
    private String userNameForPrint = "User";

    public void registerUser(String login, String password) {
        System.out.println("\n=== Registering new user ===");
        if (database.findByLogin(login) != null) {
            System.out.printf("❌ %s with this login already exists! \n", userNameForPrint);
        } else {
            User user = new User(login, password);
            database.save(user);
            logger.log("New user registered: " + login);
        }
    }

    public void login(String login, String password) {
        System.out.println("\n=== Logging in ===");
        User user = database.findByLogin(login);
        if (user == null) {
            System.out.println("❌ No user found with this login.");
        } else if (user.password().equals(password)) {
            System.out.printf("✅ Login successful. Welcome, %s! \n", login);
            logger.log("User logged in: " + login);
        } else {
            System.out.println("❌ Incorrect password!");
        }
    }

    public void deleteUser(String login) {
        System.out.println("\n=== Deleting user ===");
        User user = database.findByLogin(login);
        if (user == null) {
            System.out.printf("❌ No %s found with this login. \n", userNameForPrint);
        } else {
            database.delete(login);
            logger.log("User deleted: " + login);
        }
    }

    public void showAllUsers() {
        database.showAll();
    }

    public void setUserNameForPrint(String userNameForPrint) {
        this.userNameForPrint = userNameForPrint;
    }
}
