package domain.modelos.publicacion;

import domain.modelos.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "publicacion_estado")
@Getter
@Setter
public class EstadoPublicacion extends Persistente {

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private PosibleEstadoPublicacion estadoReal;

    @ManyToOne
    @JoinColumn(name = "publicacion_id", referencedColumnName = "id")
    private Publicacion publicacion;

    @Column(name = "fecha", columnDefinition = "DATE")
    private LocalDate fecha;

    @Column(name = "hora", columnDefinition = "TIME")
    private LocalTime hora;
}
