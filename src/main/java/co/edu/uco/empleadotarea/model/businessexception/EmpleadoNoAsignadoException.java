package co.edu.uco.empleadotarea.model.businessexception;

public class EmpleadoNoAsignadoException extends RuntimeException{
    public EmpleadoNoAsignadoException(String message) {
        super(message);
    }
}
