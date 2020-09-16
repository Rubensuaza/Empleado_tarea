package co.edu.uco.empleadotarea.model;

import co.edu.uco.empleadotarea.mensajes.MensajesException;
import co.edu.uco.empleadotarea.model.exception.BusinessException;
import co.edu.uco.empleadotarea.util.Validator;

public class Empleado {

    private Integer idEmpleado;
    private String name;
    private String lastName;
    private String job;
    private boolean active;

    private Empleado() {
        super();
    }

    public  static class EmpleadoBuilder{

        private Integer idEmpleado;
        private String name;
        private String lastName;
        private String job;
        private boolean active;

        public EmpleadoBuilder setIdEmpleado(Integer idEmpleado) {
            this.idEmpleado = idEmpleado;
            return this;
        }

        public EmpleadoBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmpleadoBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmpleadoBuilder setJob(String job) {
            this.job = job;
            return this;
        }

        public EmpleadoBuilder setActive(boolean active) {
            this.active = active;
            return this;
        }

        public Empleado build()throws BusinessException {
            Empleado empleado=new Empleado();
            Validator.numberNull(idEmpleado, MensajesException.MensajesEmpleadoExceptio.ID_VACIO);
            empleado.idEmpleado = idEmpleado;
            Validator.textNull(name, MensajesException.MensajesEmpleadoExceptio.CAMPO_VACIO);
            empleado.name=name;
            Validator.textNull(lastName, MensajesException.MensajesEmpleadoExceptio.CAMPO_VACIO);
            empleado.lastName=lastName;
            Validator.textNull(job, MensajesException.MensajesEmpleadoExceptio.CAMPO_VACIO);
            empleado.job=job;
            empleado.active=active;
            return empleado;
        }




    }



    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJob() {
        return job;
    }

    public boolean isActive() {
        return active;
    }
}
