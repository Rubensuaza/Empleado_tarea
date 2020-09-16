package co.edu.uco.empleadotarea.model;

import co.edu.uco.empleadotarea.mensajes.MensajesException;
import co.edu.uco.empleadotarea.model.exception.BusinessException;
import co.edu.uco.empleadotarea.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import co.edu.uco.empleadotarea.model.EmpleadoTarea;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;



@SpringBootTest
class EmpleadoTareaTest {

    private Empleado empleado=new Empleado.EmpleadoBuilder()
            .setIdEmpleado(1)
            .setName("Ruben")
            .setLastName("Suaza")
            .setJob("Programador").build();

    private Tarea tarea=new Tarea.TareaBuilder()
            .setIdTarea(1)
            .setNombreTarea("Test")
            .setDescripcionTarea("Realizar pruebas")
            .build();



    @Test
    public void crearEmpleadoTareaSinId()throws BusinessException{

        try {
            EmpleadoTarea empleadoTarea=new EmpleadoTarea.EmpleadoTareaBuilder().build();

        }catch (Exception e){
            assertEquals(MensajesException.MensajeEmpleadoTareaException.ID_EMPLEADO_TAREA_VACIO,e.getMessage());
        }

    }

    @Test
    public void crearEmpleadoTaresSinEMpleado()throws BusinessException{
        try {
            EmpleadoTarea empleadoTarea=new EmpleadoTarea.EmpleadoTareaBuilder().setIdEmpleadoTarea(1).build();
        }catch (Exception e){
            assertEquals(MensajesException.MensajeEmpleadoTareaException.EMPLEADO_EMPLEADO_TAREA_VACIO,e.getMessage());
        }
    }

    @Test
    public  void crearEmpleadoTareaSinTarea()throws BusinessException{
        try {
            EmpleadoTarea empleadoTarea=new EmpleadoTarea.EmpleadoTareaBuilder().setIdEmpleadoTarea(1).setEmpleado(empleado).build();

        }catch (Exception e){
            assertEquals(MensajesException.MensajeEmpleadoTareaException.TAREA_EMPLEADO_TAREA_VACIO,e.getMessage());
        }

    }

    @Test
    public void crearEmpleadoTareaSinFechaInicio()throws BusinessException{
        try {
            EmpleadoTarea empleadoTarea=new EmpleadoTarea.EmpleadoTareaBuilder()
                    .setIdEmpleadoTarea(1)
                    .setEmpleado(empleado)
                    .setTarea(tarea).build();

        }catch (Exception e){
            assertEquals(MensajesException.MensajeEmpleadoTareaException.FECHA_INICIO_EMPLEADO_TAREA_VACIO,e.getMessage());
        }
    }
    @Test
    public void empleadoTareaActivo()throws BusinessException{

            Date fechaInicio= DateUtil.convertStringToDate("2020-09-14 10:00:00");

            EmpleadoTarea empleadoTarea=new EmpleadoTarea.EmpleadoTareaBuilder()
                    .setIdEmpleadoTarea(1)
                    .setEmpleado(empleado)
                    .setTarea(tarea)
                    .setFechaInicio(fechaInicio).build();
            assertTrue(empleadoTarea.isActivo());

    }

    @Test
    public void empleadoTareaNoActivo()throws BusinessException {

        Date fechaInicio = DateUtil.convertStringToDate("2020-09-14 10:00:00");
        Date fechaFin = DateUtil.convertStringToDate("2020-09-14 16:00:00");

        EmpleadoTarea empleadoTarea = new EmpleadoTarea.EmpleadoTareaBuilder()
                .setIdEmpleadoTarea(1)
                .setEmpleado(empleado)
                .setTarea(tarea)
                .setFechaInicio(fechaInicio)
                .setFechaFin(fechaFin)
                .build();
        assertFalse(empleadoTarea.isActivo());
    }

    @Test
    public void calcularTiempoempleadoTarea()throws BusinessException {

        Date fechaInicio = DateUtil.convertStringToDate("2020-09-14 10:00:00");
        Date fechaFin = DateUtil.convertStringToDate("2020-09-14 16:00:00");

        EmpleadoTarea empleadoTarea = new EmpleadoTarea.EmpleadoTareaBuilder()
                .setIdEmpleadoTarea(1)
                .setEmpleado(empleado)
                .setTarea(tarea)
                .setFechaInicio(fechaInicio)
                .setFechaFin(fechaFin)
                .build();

        double valorReal=empleadoTarea.getTiempoEmpleadoTarea();
        double valorEsperado=6;

        assertEquals(valorEsperado,valorReal,0);
    }


}