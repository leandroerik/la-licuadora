package domain.modelos.compra;

import domain.modelos.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "compra_estado")
@Getter
@Setter
public class EstadoCompra extends Persistente {

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private PosibleEstadoCompra estadoReal;

    @ManyToOne
    @JoinColumn(name = "compra_id", referencedColumnName = "id")
    private Compra compra;

    @Column(name = "fecha", columnDefinition = "DATE")
    private LocalDate fecha;

    @Column(name = "hora", columnDefinition = "TIME")
    private LocalTime hora;
}
