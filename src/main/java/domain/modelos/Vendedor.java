package domain.modelos;

import domain.modelos.personalizacion.Personalizacion;
import domain.modelos.publicacion.Publicacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vendedor")
@Getter
@Setter
public class Vendedor extends Persistente {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "cuitCuil")
    private String cuitCuil;

    @OneToMany(mappedBy = "vendedor")
    private List<Publicacion> publicaciones;

    @Enumerated(EnumType.STRING)
    @Column(name = "mediosDePago")
    private MediosDePago mediosDePago;

    public Vendedor() {
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
    }
    
}