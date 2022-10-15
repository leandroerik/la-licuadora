package domain.modelos;

import domain.modelos.personalizacion.Personalizacion;

public class ProductoPersonalizado {
    ProductoBase producto;
    Personalizacion personalizacion;
    int precioFinal;

    public ProductoPersonalizado(ProductoBase producto, Personalizacion personalizacion, int precioFinal) {
        this.producto = producto;
        this.personalizacion = personalizacion;
        this.precioFinal = precioFinal;
    }

    public ProductoBase getProducto() {
        return producto;
    }

    public void setProducto(ProductoBase producto) {
        this.producto = producto;
    }

    public Personalizacion getPersonalizacion() {
        return personalizacion;
    }

    public void setPersonalizacion(Personalizacion personalizacion) {
        this.personalizacion = personalizacion;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }
}
