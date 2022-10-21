package domain.modelos;

import domain.modelos.carrito.CarritoDeCompra;
import domain.modelos.publicacion.Publicacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Getter
@Setter
public class Item extends Persistente {

    @OneToOne
    @JoinColumn(name = "publicacion_id", referencedColumnName = "id")
    private Publicacion publicacion;

    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "carritoDeCompra_id", referencedColumnName = "id")
    private CarritoDeCompra carritoDeCompra;
}