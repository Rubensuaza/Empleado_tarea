package co.edu.uco.empleadotarea.entity;


import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name="empleadoTarea")
public class EmpleadoTareaEntity {
    @Id
    @GeneratedValue
    @Column(name="idEmpleadoTarea")
    private Integer idEmpleadoTarea;
    @Column(name="idEmpleado")
    private int idEmpleado;
    @Column(name="idTarea")
    private int idTarea;
    @Column(name="finalizado")
    private boolean finalizado;
    @Column(name="fechaInicio")
    private Date fechaInicio;
    @Column(name="fechaFin")
    private Date fechaFin;


}
