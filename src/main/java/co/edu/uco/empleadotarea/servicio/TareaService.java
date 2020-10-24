package co.edu.uco.empleadotarea.servicio;

import co.edu.uco.empleadotarea.command.TareaCommand;
import co.edu.uco.empleadotarea.entity.TareaEntity;

import java.util.List;

public interface TareaService {

    List<TareaCommand> findAll();

    TareaEntity findById(int idTarea);
}
