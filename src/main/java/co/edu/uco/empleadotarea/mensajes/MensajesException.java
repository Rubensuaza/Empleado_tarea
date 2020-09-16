package co.edu.uco.empleadotarea.mensajes;

public class MensajesException {


    public  class MensajesEmpleadoExceptio{

        private MensajesEmpleadoExceptio() {super();
        }

        public static final String ID_VACIO="El campo id no puede ser nulo";
        public static final String CAMPO_VACIO="los campos nombre, apellido, cargo  no pueden ser nulos";

    }

    public class MensajeTareaException{

        private MensajeTareaException() {super();
        }

        public static final String ID_TAREA_VACIO="El campo idTarea no puede ser nulo";
        public static final String NOMBRE_TAREA_VACIO="El campo nombreTarea no puede ser nulo";
        public static final String DESCRIPCION_TAREA_VACIO="El campo descripcionTarea no puede ser nulo";
    }
    public class MensajeEmpleadoTareaException{

        private MensajeEmpleadoTareaException() {super();
        }

        public static final String ID_EMPLEADO_TAREA_VACIO="El campo idEmpleadoTarea no puede ser nulo";
        public static final String EMPLEADO_EMPLEADO_TAREA_VACIO="El objeto empleado no puede ser nulo";
        public static final String TAREA_EMPLEADO_TAREA_VACIO="El objeto tarea no puede ser nulo";
        public static final String FECHA_INICIO_EMPLEADO_TAREA_VACIO="la fecha de inicio de la tarea no puede estar vacia";
    }
}
