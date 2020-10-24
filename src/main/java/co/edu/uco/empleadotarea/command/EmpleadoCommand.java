package co.edu.uco.empleadotarea.command;

import co.edu.uco.empleadotarea.model.Empleado;
import co.edu.uco.empleadotarea.model.Tarea;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
@NoArgsConstructor
public class EmpleadoCommand {

    private Integer idEmpleado;
    private String nombre;
    private String apellido;
    private String cargo;
    private boolean activo;


}
