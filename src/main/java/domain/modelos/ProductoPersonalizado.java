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
    @JoinColumn(name = "producto_base_id",referencedColumnName = "id")
    private ProductoBase producto;

    @ManyToOne
    @JoinColumn(name = "personalizacion_id",referencedColumnName = "id")
    private Personalizacion personalizacion;

    @Column(name = "precio_final")
    private Float precioFinal;

}
