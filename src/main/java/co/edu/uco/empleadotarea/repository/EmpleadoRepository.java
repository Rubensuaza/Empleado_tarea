package co.edu.uco.empleadotarea.repository;

import co.edu.uco.empleadotarea.entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Integer>{

}