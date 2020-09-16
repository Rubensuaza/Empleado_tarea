package co.edu.uco.empleadotarea.model;

import co.edu.uco.empleadotarea.mensajes.MensajesException;
import co.edu.uco.empleadotarea.model.exception.BusinessException;
import co.edu.uco.empleadotarea.util.DateUtil;
import co.edu.uco.empleadotarea.util.Validator;

import java.util.Date;

public class EmpleadoTarea {

    private Integer idEmpleadoTarea;
    private Empleado empleado;
    private Tarea tarea;
    private Date fechaInicio;
    private Date fechaFin;
    private boolean activo;
    private double tiempoEmpleadoTarea;

    private EmpleadoTarea() {super();}

    public static class EmpleadoTareaBuilder{

        private Integer idEmpleadoTarea;
        private Empleado empleado;
        private Tarea tarea;
        private Date fechaInicio;
        private Date fechaFin;
        private boolean activo;
        private double tiempoEmpleadoTarea;

        public EmpleadoTareaBuilder setIdEmpleadoTarea(Integer idEmpleadoTarea) {
            this.idEmpleadoTarea = idEmpleadoTarea;
            return this;
        }

        public EmpleadoTareaBuilder setEmpleado(Empleado empleado) {
            this.empleado = empleado;
            return this;
        }

        public EmpleadoTareaBuilder setTarea(Tarea tarea) {
            this.tarea = tarea;
            return this;
        }

        public EmpleadoTareaBuilder setFechaInicio(Date fechaInicio) {
            this.fechaInicio = fechaInicio;
            return this;
        }

        public EmpleadoTareaBuilder setFechaFin(Date fechaFin) {
            this.fechaFin = fechaFin;
            return this;
        }

        public EmpleadoTareaBuilder setActivo(boolean activo) {
            this.activo = activo;
            return this;
        }



        public EmpleadoTarea build()throws BusinessException{
            EmpleadoTarea empleadoTarea=new EmpleadoTarea();
            Validator.numberNull(idEmpleadoTarea, MensajesException.MensajeEmpleadoTareaException.ID_EMPLEADO_TAREA_VACIO);
            empleadoTarea.idEmpleadoTarea=this.idEmpleadoTarea;
            Validator.objectNull(empleado, MensajesException.MensajeEmpleadoTareaException.EMPLEADO_EMPLEADO_TAREA_VACIO);
            empleadoTarea.empleado=this.empleado;
            Validator.objectNull(tarea, MensajesException.MensajeEmpleadoTareaException.TAREA_EMPLEADO_TAREA_VACIO);
            empleadoTarea.tarea=this.tarea;
            Validator.dateNull(fechaInicio,MensajesException.MensajeEmpleadoTareaException.FECHA_INICIO_EMPLEADO_TAREA_VACIO);
            empleadoTarea.fechaInicio=this.fechaInicio;
            Validator.dateNull(fechaInicio, MensajesException.MensajeEmpleadoTareaException.FECHA_INICIO_EMPLEADO_TAREA_VACIO);
            empleadoTarea.fechaFin=this.fechaFin;
            empleadoTarea.activo= empleadoTarea.cambiarEstadoEmpleadoTarea();
            empleadoTarea.tiempoEmpleadoTarea=empleadoTarea.calcularTiempoEmpleadoTarea();


            return empleadoTarea;

        }
    }
    public boolean cambiarEstadoEmpleadoTarea(){
        if(fechaFin==null){
            this.activo=true;
        }
        return this.activo;
    }

    public double calcularTiempoEmpleadoTarea(){
        return DateUtil.minutesDiff(fechaInicio,fechaFin);
    }

    public Integer getIdEmpleadoTarea() {
        return idEmpleadoTarea;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public boolean isActivo() {
        return activo;
    }

    public double getTiempoEmpleadoTarea() {
        return tiempoEmpleadoTarea;
    }
}
