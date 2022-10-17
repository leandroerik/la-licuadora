package domain.modelos;

import domain.modelos.personalizacion.Personalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "producto_personalizado")
@Getter
@Setter
public class ProductoPersonalizado {
    @Transient
    ProductoBase producto;

    @Transient
    Personalizacion personalizacion;

    @Column(name = "precio_final")
    int precioFinal;

    public ProductoPersonalizado(ProductoBase producto, Personalizacion personalizacion, int precioFinal) {
        this.producto = producto;
        this.personalizacion = personalizacion;
        this.precioFinal = precioFinal;
    }

}
