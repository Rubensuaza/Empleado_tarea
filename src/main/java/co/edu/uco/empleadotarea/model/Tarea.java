package co.edu.uco.empleadotarea.model;

import co.edu.uco.empleadotarea.mensajes.MensajesException;
import co.edu.uco.empleadotarea.model.exception.BusinessException;
import co.edu.uco.empleadotarea.util.Validator;

public class Tarea {

    private Integer idTarea;
    private String nombreTarea;
    private String descripcionTarea;
    private boolean activo;

    private Tarea() {super();
    }

    public static class TareaBuilder{

        private Integer idTarea;
        private String nombreTarea;
        private String descripcionTarea;
        private boolean activo;

        public TareaBuilder setIdTarea(Integer idTarea) {
            this.idTarea = idTarea;
            return this;
        }

        public TareaBuilder setNombreTarea(String nombreTarea) {
            this.nombreTarea = nombreTarea;
            return this;
        }

        public TareaBuilder setDescripcionTarea(String descripcionTarea) {
            this.descripcionTarea = descripcionTarea;
            return this;
        }

        public TareaBuilder setActivo(boolean activo) {
            this.activo = activo;
            return this;
        }

        public Tarea build()throws BusinessException {
            Tarea tarea=new Tarea();
            Validator.numberNull(idTarea, MensajesException.MensajeTareaException.ID_TAREA_VACIO);
            tarea.idTarea=this.idTarea;
            Validator.textNull(nombreTarea, MensajesException.MensajeTareaException.NOMBRE_TAREA_VACIO);
            tarea.nombreTarea=this.nombreTarea;
            Validator.textNull(descripcionTarea, MensajesException.MensajeTareaException.DESCRIPCION_TAREA_VACIO);
            tarea.descripcionTarea=this.descripcionTarea;
            tarea.activo=this.activo;
            return tarea;
        }


    }

    public Integer getIdTarea() {
        return idTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public boolean isActivo() {
        return activo;
    }

    public Tarea setActivo(boolean activo) {
        this.activo = activo;
        return this;
    }
}
