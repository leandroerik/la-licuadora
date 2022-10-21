package domain.modelos.carritoDeCompra;

import domain.modelos.Comprador;
import domain.modelos.Item;
import domain.modelos.Persistente;
import domain.modelos.compra.EstadoCompra;
import domain.modelos.publicacion.EstadoPublicacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carrito_de_compra")
@Getter
@Setter
public class CarritoDeCompra extends Persistente {

    @OneToOne
    @JoinColumn(name = "comprador_id", referencedColumnName = "id")
    private Comprador comprador;

    @OneToMany(mappedBy = "carritoDeCompra")
    private List<Item> items;

    @OneToMany(mappedBy = "carritoDeCompra")
    private List<EstadoCarrito> estados;

    public CarritoDeCompra() {
        this.estados = new ArrayList<>();
        this.items = new ArrayList<>();
    }
}