package co.edu.uco.empleadotarea.model.businessexception;

public class TareaNoExisteException extends RuntimeException {

    public TareaNoExisteException(String message) {
        super(message);
    }
}
