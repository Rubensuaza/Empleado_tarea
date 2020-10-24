package co.edu.uco.empleadotarea.repository;

import co.edu.uco.empleadotarea.entity.EmpleadoTareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoTareaRepository extends JpaRepository<EmpleadoTareaEntity, Integer> {



    EmpleadoTareaEntity findByIdEmpleadoAndFinalizado(int idEmpleado, boolean b);
}
