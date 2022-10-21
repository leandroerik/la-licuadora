package domain.modelos.personalizacion;

import domain.modelos.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "posible_personalizacion")
@Getter
@Setter
public class PosiblePersonalizacion extends Persistente {

    @ManyToOne
    @JoinColumn(name = "area_id",referencedColumnName = "id")
    private AreaPersonalizacion area;

    @ManyToOne
    @JoinColumn(name = "tipo_id",referencedColumnName = "id")
    private TipoPersonalizacion tipo;

}
