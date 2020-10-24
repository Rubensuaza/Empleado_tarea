package co.edu.uco.empleadotarea.servicio;

import co.edu.uco.empleadotarea.command.EmpleadoTareaCommand;
import co.edu.uco.empleadotarea.model.EmpleadoTarea;

public interface EmpleadoTareaService {


    String registrarTarea(EmpleadoTareaCommand empleadoTareaCommand);

    EmpleadoTarea finalizarTarea(int idEmpleado);
}
