package domain.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Gestor {
    String nombre;
    List<ProductoBase> productos;

    public Gestor(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoBase productoBase){
        productos.add(productoBase);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ProductoBase> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoBase> productos) {
        this.productos = productos;
    }
}
