package co.edu.uco.empleadotarea.fabrica;

import co.edu.uco.empleadotarea.entity.EmpleadoEntity;
import co.edu.uco.empleadotarea.entity.EmpleadoTareaEntity;
import co.edu.uco.empleadotarea.entity.TareaEntity;
import co.edu.uco.empleadotarea.model.Empleado;
import co.edu.uco.empleadotarea.model.EmpleadoTarea;
import co.edu.uco.empleadotarea.model.Tarea;
import org.springframework.stereotype.Component;

@Component
public class EmpleadoTareaFabrica {

    public EmpleadoTarea entityToModel(EmpleadoTareaEntity empleadoTareaEntity, EmpleadoEntity empleadoEntity, TareaEntity tareaEntity){
        Empleado empleado=new Empleado.EmpleadoBuilder().
                setIdEmpleado(empleadoEntity.getIdEmpleado()).
                setNombre(empleadoEntity.getNombre()).
                setApellido(empleadoEntity.getApellido()).
                setCargo(empleadoEntity.getCargo()).
                setActivo(empleadoEntity.isActivo()).build();
        Tarea tarea=new Tarea.TareaBuilder().
                setIdTarea(tareaEntity.getIdTarea()).
                setNombreTarea(tareaEntity.getNombreTarea()).
                setDescripcionTarea(tareaEntity.getDescripcionTarea()).
                setActivo(tareaEntity.isActivo()).build();
        EmpleadoTarea empleadoTarea=new EmpleadoTarea.EmpleadoTareaBuilder().
                setIdEmpleadoTarea(empleadoTareaEntity.getIdEmpleadoTarea()).
                setEmpleado(empleado).
                setTarea(tarea).
                setFechaInicio(empleadoTareaEntity.getFechaInicio()).
                setFechaFin(empleadoTareaEntity.getFechaFin()).
                setActivo(empleadoTareaEntity.isFinalizado()).build();
        return empleadoTarea;
    }
}
