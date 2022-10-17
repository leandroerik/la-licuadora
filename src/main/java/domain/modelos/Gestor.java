package domain.modelos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="gestor")
@Getter
@Setter
public class Gestor extends Persistente {

    @Column(name="nombre")
    private String nombre;

    @OneToMany(mappedBy = "gestor")
    private List<ProductoBase> productos;

    public Gestor(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoBase productoBase){
        productos.add(productoBase);
    }

}
