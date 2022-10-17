package domain.modelos;

import domain.modelos.personalizacion.Personalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "producto_personalizado")
@Getter
@Setter
public class ProductoPersonalizado extends Persistente{

    @ManyToOne
    @JoinColumn(name = "producto_id",referencedColumnName = "id")
    private ProductoBase producto;

    @ManyToOne
    @JoinColumn(name = "personalizacion_id",referencedColumnName = "id")
    private Personalizacion personalizacion;

    @Column(name = "precio_final")
    int precioFinal;

    public ProductoPersonalizado(ProductoBase producto, Personalizacion personalizacion, int precioFinal) {
        this.producto = producto;
        this.personalizacion = personalizacion;
        this.precioFinal = precioFinal;
    }

}
