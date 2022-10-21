package domain.modelos.personalizacion;

import domain.modelos.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "area_personalizacion")
@Getter
@Setter
public class AreaPersonalizacion extends Persistente {

    @Column(name="nombre_area")
    private String nombreArea;

}
