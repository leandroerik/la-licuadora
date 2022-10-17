package domain.modelos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="gestor")
@Getter
@Setter
public class Gestor extends Persistente {
    @Column(name="nombre")
    String nombre;
    @Transient
    List<ProductoBase> productos;

    public Gestor(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoBase productoBase){
        productos.add(productoBase);
    }

}
