package co.edu.uco.empleadotarea.controller.consultas;

import co.edu.uco.empleadotarea.command.EmpleadoCommand;
import co.edu.uco.empleadotarea.command.TareaCommand;
import co.edu.uco.empleadotarea.servicio.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tarea")
public class TareaRestController {

    @Autowired
    private TareaService tareaService;

    @GetMapping("/v1/listado-tareas")
    public List<TareaCommand> findAll(){
        return tareaService.findAll();
    }
}
