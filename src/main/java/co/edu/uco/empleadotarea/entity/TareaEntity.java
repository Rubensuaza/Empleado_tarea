package co.edu.uco.empleadotarea.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name="tarea")
public class TareaEntity {

    @Id
    @Column(name="idTarea")
    private Integer idTarea;
    @Column(name="nombre")
    private String nombreTarea;
    @Column(name="decripcion")
    private String descripcionTarea;
    @Column(name="estado")
    private boolean activo;
}
