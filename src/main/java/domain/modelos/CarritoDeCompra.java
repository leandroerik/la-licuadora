package domain.modelos;

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

    public CarritoDeCompra() {
        this.items = new ArrayList<>();
    }
}

// TODO agregarItem? metodo add item
// TODO bidireccional con item
// TODO relacionar con compra