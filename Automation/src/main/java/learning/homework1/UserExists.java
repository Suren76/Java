package learning.homework1;

public class UserExists extends RuntimeException{
    public UserExists() {
    }

    public UserExists(String message) {
        super(message);
    }
}
