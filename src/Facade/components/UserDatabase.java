package Facade;

import java.util.*;

class UserDatabase {
    private List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
        System.out.println("User saved: " + user.getLogin());
    }

    public void delete(String login) {
        users.removeIf(u -> u.getLogin().equalsIgnoreCase(login));
        System.out.println("User deleted: " + login);
    }

    public User findByLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equalsIgnoreCase(login)) {
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
                System.out.println(user.getLogin());
            }
        }
        System.out.println("---------------------------------\n");
    }
}