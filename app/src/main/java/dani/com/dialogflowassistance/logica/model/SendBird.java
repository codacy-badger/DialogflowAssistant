package dani.com.dialogflowassistance.logica.model;

public class SendBird {
    private static User currentUser;

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User user) {
        currentUser = user;
    }
}
