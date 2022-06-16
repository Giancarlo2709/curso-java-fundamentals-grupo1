package pe.gyarlequej.sesion7;

public class NoOvertimeAllowedException extends RuntimeException {

    private String message;

    public NoOvertimeAllowedException(String message) {
        super(message);
    }
}
