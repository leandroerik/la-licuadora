package domain.modelos.personalizacion;

import domain.modelos.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "personalizacion")
@Getter
@Setter
public class Personalizacion extends Persistente {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private Float precio;

    @OneToOne
    @JoinColumn(name = "posible_personalizacion_id",referencedColumnName = "id")
    private PosiblePersonalizacion posiblePersonalizacion;

    @Column(name = "contenido")
    private String contenido;

}
