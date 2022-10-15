package domain.modelos.publicacion;

import domain.modelos.ProductoPersonalizado;
import domain.modelos.Vendedor;
import domain.modelos.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "publicacion")
@Getter
@Setter
public class Publicacion extends Persistente {

    @ManyToOne
    @JoinColumn(name = "vendedor_id", referencedColumnName = "id")
    private Vendedor vendedor;

    @Transient
    private ProductoPersonalizado productoPersonalizado;

    @Column(name = "fechaDePublicacion", columnDefinition = "DATE")
    private LocalDate fechaDePublicacion;

    @OneToMany(mappedBy = "publicacion")
    private List<EstadoPublicacion> estados;

    public Publicacion() {
        this.estados = new ArrayList<>();
    }

    public void agregarEstados(EstadoPublicacion estado) {
        this.estados.add(estado);
    }
}

// TODO mapear producto personalizado