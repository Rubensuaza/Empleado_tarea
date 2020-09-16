package co.edu.uco.empleadotarea.util;

import co.edu.uco.empleadotarea.model.exception.BusinessException;

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









}
