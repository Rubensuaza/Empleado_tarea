package co.edu.uco.empleadotarea.command;

import co.edu.uco.empleadotarea.model.Empleado;
import co.edu.uco.empleadotarea.model.Tarea;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class EmpleadoTareaCommand {


    private int idEmpleado;
    private int idTarea;

}
