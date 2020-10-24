package co.edu.uco.empleadotarea.fabrica;

import co.edu.uco.empleadotarea.command.EmpleadoCommand;
import co.edu.uco.empleadotarea.entity.EmpleadoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpleadoFabrica {


    public  List<EmpleadoCommand> entityToCommand(List<EmpleadoEntity> listaEmpleadoEntity) {
        List<EmpleadoCommand> listaEmpleadoCommand=new ArrayList<>();
        listaEmpleadoEntity.forEach(e->listaEmpleadoCommand.add(entityToCommand(e)));
        return listaEmpleadoCommand;
    }

    private EmpleadoCommand entityToCommand(EmpleadoEntity empleadoEntity){
        EmpleadoCommand empleadoCommand=new EmpleadoCommand();
        empleadoCommand.setIdEmpleado(empleadoEntity.getIdEmpleado());
        empleadoCommand.setNombre(empleadoEntity.getNombre());
        empleadoCommand.setApellido(empleadoEntity.getApellido());
        empleadoCommand.setCargo(empleadoEntity.getCargo());
        empleadoCommand.setActivo(empleadoEntity.isActivo());
        return  empleadoCommand;
    }

}
