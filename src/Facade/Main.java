package Facade;

public class Main {
    public static void main(String[] args) {
        UserFacade userFacade = new UserFacade();

        userFacade.registerUser("admin", "1234");
        userFacade.registerUser("guest", "abcd");
        userFacade.registerUser("admin", "test");

        userFacade.showAllUsers();

        userFacade.login("admin", "1234");
        userFacade.login("guest", "wrong");

        userFacade.deleteUser("guest");
        userFacade.deleteUser("unknown");

        userFacade.showAllUsers();
    }
}
