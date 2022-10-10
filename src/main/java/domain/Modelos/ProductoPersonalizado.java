package domain.Modelos;

import java.util.ArrayList;
import java.util.List;

public class ProductoPersonalizado {
    ProductoBase producto;
    List<Personalizacion> personalizaciones;
    int precioFinal;

    public ProductoPersonalizado(ProductoBase producto) {
        this.producto = producto;
        this.personalizaciones = new ArrayList<>();
    }

    public void agregarPersonalizacion(Personalizacion personalizacion){
        personalizaciones.add(personalizacion);
    }

    public ProductoBase getProducto() {
        return producto;
    }

    public void setProducto(ProductoBase producto) {
        this.producto = producto;
    }

    public List<Personalizacion> getPersonalizaciones() {
        return personalizaciones;
    }

    public void setPersonalizaciones(List<Personalizacion> personalizaciones) {
        this.personalizaciones = personalizaciones;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }
}
