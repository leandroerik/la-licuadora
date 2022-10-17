package domain.modelos.personalizacion;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Persistence;

@Entity(name = "area_personalizacion")
@Getter
@Setter
public class AreaPersonalizacion extends Persistence {
    @Column(name="desc_area")
    String descripcionArea;

    public AreaPersonalizacion(String descripcionArea) {
        this.descripcionArea = descripcionArea;
    }

}
