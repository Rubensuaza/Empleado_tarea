package co.edu.uco.empleadotarea.model.businessexception;

public class EmpleadoNoExisteException extends RuntimeException{

    public EmpleadoNoExisteException(String message) {
        super(message);
    }
}
