package co.edu.uco.empleadotarea.servicio.impl;

import co.edu.uco.empleadotarea.command.EmpleadoCommand;
import co.edu.uco.empleadotarea.command.EmpleadoTareaCommand;
import co.edu.uco.empleadotarea.entity.EmpleadoEntity;
import co.edu.uco.empleadotarea.entity.EmpleadoTareaEntity;
import co.edu.uco.empleadotarea.entity.TareaEntity;
import co.edu.uco.empleadotarea.fabrica.EmpleadoTareaFabrica;
import co.edu.uco.empleadotarea.mensajes.MensajesException;
import co.edu.uco.empleadotarea.model.EmpleadoTarea;
import co.edu.uco.empleadotarea.model.businessexception.EmpleadoAsignadoException;
import co.edu.uco.empleadotarea.model.businessexception.EmpleadoNoExisteException;
import co.edu.uco.empleadotarea.model.businessexception.TareaNoExisteException;
import co.edu.uco.empleadotarea.repository.EmpleadoTareaRepository;
import co.edu.uco.empleadotarea.servicio.EmpleadoService;
import co.edu.uco.empleadotarea.servicio.EmpleadoTareaService;
import co.edu.uco.empleadotarea.servicio.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EmpleadoTareaServiceImpl implements EmpleadoTareaService {


    private static final String TAREA_ASIGNADA_EXISTOSAMENTE="La tarea ha sido asignada exitosamente!";

    @Autowired
    private EmpleadoService empleadoService;

    @Autowired
    private TareaService tareaService;

    @Autowired
    private EmpleadoTareaRepository empleadoTareaRepository;

    @Autowired
    private EmpleadoTareaFabrica empleadoTareaFabrica;


    @Override
    public String registrarTarea(EmpleadoTareaCommand empleadoTareaCommand) {
        validarEmpleado(empleadoTareaCommand.getIdEmpleado());
        validarTarea(empleadoTareaCommand.getIdTarea());
        validarEmpleadoAsignando(empleadoTareaCommand.getIdEmpleado());
        EmpleadoTareaEntity empleadoTareaEntity=new EmpleadoTareaEntity();
        empleadoTareaEntity.setIdEmpleado(empleadoTareaCommand.getIdEmpleado());
        empleadoTareaEntity.setIdTarea(empleadoTareaCommand.getIdTarea());
        empleadoTareaEntity.setFinalizado(false);
        empleadoTareaEntity.setFechaInicio(new Date());
        empleadoTareaRepository.save(empleadoTareaEntity);
        return TAREA_ASIGNADA_EXISTOSAMENTE;
    }

    @Override
    public EmpleadoTarea finalizarTarea(int idEmpleado) {
        EmpleadoTareaEntity empleadoTareaEntity=empleadoTareaRepository.findByIdEmpleadoAndFinalizado(idEmpleado,false);
        validarEmpleadoNoExiste(empleadoTareaEntity);
        empleadoTareaEntity.setFechaFin(new Date());
        empleadoTareaEntity.setFinalizado(true);
        empleadoTareaRepository.save(empleadoTareaEntity);
        EmpleadoEntity empleadoEntity=empleadoService.findById(empleadoTareaEntity.getIdEmpleado());
        TareaEntity tareaEntity=tareaService.findById(empleadoTareaEntity.getIdTarea());
        return empleadoTareaFabrica.entityToModel(empleadoTareaEntity,empleadoEntity,tareaEntity);
    }

    private void validarEmpleadoNoExiste(EmpleadoTareaEntity empleadoTareaEntity) {
        if (empleadoTareaEntity==null){
            throw new EmpleadoNoExisteException(MensajesException.MensajesEmpleadoExceptio.EMPLEADO_NO_ASIGANDO);
        }
    }

    private void validarEmpleadoAsignando(int idEmpleado) {
        if (empleadoTareaRepository.findByIdEmpleadoAndFinalizado(idEmpleado,false)!=null){
            throw new EmpleadoAsignadoException(MensajesException.MensajesEmpleadoExceptio.EMPLEADO_ASIGANDO);
        }

    }

    private void validarEmpleado(int idEmpleado){
       if (empleadoService.findById(idEmpleado)==null){
           throw new EmpleadoNoExisteException(MensajesException.MensajesEmpleadoExceptio.EMPLEADO_NO_EXISTE);

       }
    }

    private void validarTarea(int idTarea){
        if (tareaService.findById(idTarea)==null){
            throw new TareaNoExisteException("la tarea no existe");

        }
    }
}
