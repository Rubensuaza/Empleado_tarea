package co.edu.uco.empleadotarea.model;

import co.edu.uco.empleadotarea.mensajes.MensajesException;
import co.edu.uco.empleadotarea.model.businessexception.BusinessException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TareaTest {

    @Test
    public void requerirIdTarea() throws BusinessException{
        try {
            Tarea tarea = new Tarea.TareaBuilder().build();
        }catch (BusinessException ex){
            assertEquals(MensajesException.MensajeTareaException.ID_TAREA_VACIO,ex.getMessage());
        }
    }

    @Test
    public void requerirNombreTarea() throws BusinessException{
        try {
            Tarea tarea = new Tarea.TareaBuilder().setIdTarea(1).build();
        }catch (BusinessException ex){
            assertEquals(MensajesException.MensajeTareaException.NOMBRE_TAREA_VACIO,ex.getMessage());
        }
    }

    @Test
    public void requerirDescripcionTarea() throws BusinessException{
        try {
            Tarea tarea = new Tarea.TareaBuilder().setIdTarea(1).setNombreTarea("barrer").build();
        }catch (BusinessException ex){
            assertEquals(MensajesException.MensajeTareaException.DESCRIPCION_TAREA_VACIO,ex.getMessage());
        }
    }


}