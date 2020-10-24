package co.edu.uco.empleadotarea.servicio;

import co.edu.uco.empleadotarea.command.EmpleadoCommand;
import co.edu.uco.empleadotarea.entity.EmpleadoEntity;
import co.edu.uco.empleadotarea.model.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpleadoService {

    List<EmpleadoCommand> findAll();

    EmpleadoEntity findById(int idEmpleado);
}
