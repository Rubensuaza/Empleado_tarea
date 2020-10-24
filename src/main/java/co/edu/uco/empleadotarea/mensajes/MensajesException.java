package co.edu.uco.empleadotarea.mensajes;

public class MensajesException {


    public  class MensajesEmpleadoExceptio{

        private MensajesEmpleadoExceptio() {super();
        }

        public static final String ID_VACIO="El campo id no puede ser nulo";
        public static final String CAMPO_VACIO="los campos nombre, apellido, cargo  no pueden ser nulos";
        public static final String EMPLEADO_NO_EXISTE="El empleado no existe";
        public static final String EMPLEADO_ASIGANDO="El empleado se encuentra asignado";
        public static final String EMPLEADO_NO_ASIGANDO="El empleado no se encuentra asignado en alguna tarea";

    }

    public class MensajeTareaException{

        private MensajeTareaException() {super();
        }

        public static final String ID_TAREA_VACIO="El campo idTarea no puede ser nulo";
        public static final String NOMBRE_TAREA_VACIO="El campo nombreTarea no puede ser nulo";
        public static final String DESCRIPCION_TAREA_VACIO="El campo descripcionTarea no puede ser nulo";
        public static final String TAREA_NO_EXISTE="La terea no existe";
    }
    public class MensajeEmpleadoTareaException{

        private MensajeEmpleadoTareaException() {super();
        }

        public static final String ID_EMPLEADO_TAREA_VACIO="El campo idEmpleadoTarea no puede ser nulo";
        public static final String EMPLEADO_EMPLEADO_TAREA_VACIO="El objeto empleado no puede ser nulo";
        public static final String TAREA_EMPLEADO_TAREA_VACIO="El objeto tarea no puede ser nulo";
        public static final String FECHA_INICIO_EMPLEADO_TAREA_VACIO="la fecha de inicio de la tarea no puede estar vacia";
        public static final String EMPLEADO_INACTIVO="El Empleado el cual quiere asignar la tarea no se encuentra activo";
        public static final String TAREA_INACTIVO="La tarea la cual quiere asignar  no se encuentra activa";

    }


}
