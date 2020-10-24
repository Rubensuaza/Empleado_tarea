package co.edu.uco.empleadotarea.controller.consultas;


import co.edu.uco.empleadotarea.command.EmpleadoTareaCommand;
import co.edu.uco.empleadotarea.model.EmpleadoTarea;
import co.edu.uco.empleadotarea.model.businessexception.*;
import co.edu.uco.empleadotarea.servicio.EmpleadoTareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleadoTarea")
public class EmpleadoTareaController {

    @Autowired
    private EmpleadoTareaService empleadoTareaService;

    @PostMapping("/registro")
    public String registarEmpleadoTarea(@RequestBody EmpleadoTareaCommand empleadoTareaCommand) {
        return empleadoTareaService.registrarTarea(empleadoTareaCommand);
    }

    @GetMapping("/{idEmpleado}/registro")
    public EmpleadoTarea finalizarTarea(@PathVariable  int idEmpleado)throws BusinessException {
        return empleadoTareaService.finalizarTarea(idEmpleado);
    }
}
