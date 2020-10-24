package co.edu.uco.empleadotarea.util;

import co.edu.uco.empleadotarea.model.Empleado;
import co.edu.uco.empleadotarea.model.Tarea;
import co.edu.uco.empleadotarea.model.businessexception.BusinessException;

import java.util.Date;

public class Validator {

    public Validator() {super();
    }

    public static void numberNull(Integer valor, String mensaje) throws BusinessException{
        if(valor==null){
            throw new BusinessException(mensaje);

        }
    }

    public static void textNull(String valor, String mensaje) throws BusinessException{
        if(valor==null){
            throw new BusinessException(mensaje);

        }
    }

    public static void objectNull(Object object, String mensaje)throws  BusinessException{
        if(object==null){
            throw new BusinessException(mensaje);
        }
    }

    public static void dateNull(Date fecha, String mensaje)throws  BusinessException{
        if(fecha==null){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarEmpleadoActivo(Empleado empleado, String mensaje)throws BusinessException{
        if(!empleado.isActivo()){
            throw new BusinessException(mensaje);
        }


    }

    public static void validarTareaActivo(Tarea tarea, String mensaje)throws BusinessException {
        if (!tarea.isActivo()) {
            throw new BusinessException(mensaje);
        }
    }

}
