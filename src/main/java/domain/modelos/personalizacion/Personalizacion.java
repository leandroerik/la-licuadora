package domain.modelos.personalizacion;

import domain.modelos.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "personalizacion")
@Getter
@Setter
public class Personalizacion extends Persistente {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private int precio;

    @Transient
    private PosiblePersonalizacion categoria;

    @Column(name = "contenido")
    private String contenido;

    public Personalizacion(String nombre, int precio, PosiblePersonalizacion categoria, String contenido) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.contenido = contenido;
    }
}
