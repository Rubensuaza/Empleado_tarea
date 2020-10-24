package co.edu.uco.empleadotarea.servicio.impl;

import co.edu.uco.empleadotarea.command.EmpleadoCommand;
import co.edu.uco.empleadotarea.entity.EmpleadoEntity;
import co.edu.uco.empleadotarea.fabrica.EmpleadoFabrica;
import co.edu.uco.empleadotarea.repository.EmpleadoRepository;
import co.edu.uco.empleadotarea.servicio.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private EmpleadoFabrica empleadoFabrica;

    @Override
    public List<EmpleadoCommand> findAll() {
        return empleadoFabrica.entityToCommand(empleadoRepository.findAll());
    }

    @Override
    public EmpleadoEntity findById(int idEmpleado) {
        return empleadoRepository.findById(idEmpleado).orElse(null);
    }
}
