package Facade.components;

import java.util.*;

public class UserDatabase {
    private final List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
        System.out.println("User saved: " + user.login());
    }

    public void delete(String login) {
        users.removeIf(u -> u.login().equalsIgnoreCase(login));
        System.out.println("User deleted: " + login);
    }

    public User findByLogin(String login) {
        for (User user : users) {
            if (user.login().equalsIgnoreCase(login)) {
                return user;
            }
        }
        return null;
    }

    public void showAll() {
        System.out.println("\n--- Current users in database ---");
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            for (User user : users) {
                System.out.println(user.login());
            }
        }
        System.out.println("---------------------------------\n");
    }
}