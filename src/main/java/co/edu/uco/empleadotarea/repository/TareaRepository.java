package co.edu.uco.empleadotarea.repository;


import co.edu.uco.empleadotarea.entity.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TareaRepository extends JpaRepository<TareaEntity, Integer> {
}
