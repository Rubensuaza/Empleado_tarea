package co.edu.uco.empleadotarea.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name="empleado")
@NoArgsConstructor
public class EmpleadoEntity {

    @Id
    @Column(name="idEmpleado")
    private Integer idEmpleado;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="cargo")
    private String cargo;
    @Column(name="estado")
    private boolean activo;




}
