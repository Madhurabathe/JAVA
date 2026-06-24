package Exception;

public class InvalidPIN extends RuntimeException {
    public InvalidPIN(String message) {
        super(message);
    }
    
}
