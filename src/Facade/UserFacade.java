package Facade;

class UserFacade {
    private final UserDatabase database;
    private final Logger logger;

    public UserFacade() {
        this.database = new UserDatabase();
        this.logger = new Logger();
    }

    public void registerUser(String login, String password) {
        System.out.println("\n=== Registering new user ===");
        if (database.findByLogin(login) != null) {
            System.out.println("❌ User with this login already exists!");
            return;
        }
        User user = new User(login, password);
        database.save(user);
        logger.log("New user registered: " + login);
    }

    public void login(String login, String password) {
        System.out.println("\n=== Logging in ===");
        User user = database.findByLogin(login);
        if (user == null) {
            System.out.println("❌ No user found with this login.");
            return;
        }
        if (user.getPassword().equals(password)) {
            System.out.println("✅ Login successful. Welcome, " + login + "!");
            logger.log("User logged in: " + login);
        } else {
            System.out.println("❌ Incorrect password!");
        }
    }

    public void deleteUser(String login) {
        System.out.println("\n=== Deleting user ===");
        User user = database.findByLogin(login);
        if (user == null) {
            System.out.println("❌ No user found with this login.");
            return;
        }
        database.delete(login);
        logger.log("User deleted: " + login);
    }

    public void showAllUsers() {
        database.showAll();
    }
}
