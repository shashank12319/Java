package exceptionhandling;


 @SuppressWarnings("serial")
class ActionNotAllowedException extends Exception {
    private String message;

    public ActionNotAllowedException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

 class User {
    private boolean allowedToPerformAction;

    public User(boolean allowedToPerformAction) {
        this.allowedToPerformAction = allowedToPerformAction;
    }

    public boolean isAllowedToPerformAction() {
        return allowedToPerformAction;
    }

    public void performAction() throws ActionNotAllowedException {
        if (!allowedToPerformAction) {
            throw new ActionNotAllowedException("Error: Action not allowed for this user.");
        }
       
    }
}

public class Example5 {
    public static void main(String[] args) {
        // Case 1: User is allowed to perform action
        User user1 = new User(true);
        try {
            user1.performAction();
            System.out.println("Action performed successfully.");
        } catch (ActionNotAllowedException e) {
            System.out.println(e.getMessage());
        }

        // Case 2: User is not allowed to perform action
        User user2 = new User(false);
        try {
            user2.performAction();
            System.out.println("Action performed successfully.");
        } catch (ActionNotAllowedException e) {
            System.out.println(e.getMessage());
        }
    }
}

