package food;

public class WrongFoodException extends Exception {
    public WrongFoodException(String message) { super(message); }

    public WrongFoodException() { super(); }

    public WrongFoodException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongFoodException(Throwable cause) {
        super(cause);
    }
}
