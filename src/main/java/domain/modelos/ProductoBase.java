package domain.modelos;

import domain.modelos.personalizacion.PosiblePersonalizacion;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="producto_base")
@Getter
@Setter
public class ProductoBase extends Persistente{

    @Column(name = "nombre")
    private String nombre;
    @Transient
    @Column(name = "descripcion")
    private String descripcion;

    @Transient
    @OneToMany
    @JoinColumn(name = "producto_base_id", referencedColumnName = "id")
    @JsonIgnore
    private List<PosiblePersonalizacion> personalizacionesPermitidas;

    @Transient
    @Column(name="tiempo_fabricacion")
    private Integer tiempoFabricacion;

    @Transient
    @Column(name = "precio_base")
    private Float precioBase;



    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name="gestor_id",referencedColumnName = "id")
    private Gestor gestor;

    public ProductoBase(){}

    public ProductoBase(String nombre){
        this.nombre = nombre;
        this.personalizacionesPermitidas = new ArrayList<>();
    }

    public void agregarPersonalizacion(PosiblePersonalizacion posible){
        personalizacionesPermitidas.add(posible);
    }

}
