package domain.modelos;

import domain.modelos.personalizacion.PosiblePersonalizacion;
import lombok.Getter;
import lombok.Setter;

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

    @Column(name = "descripcion")
    private String descripcion;

    @Transient
    List<PosiblePersonalizacion> personalizacionesPermitidas;

    @Column(name="tiempo_fabricacion")
    private int tiempoFabricacion;

    @Column(name = "precio_base")
    private int precioBase;

    @ManyToOne
    @JoinColumn(name="gestor_id",referencedColumnName = "id")
    private Gestor gestor;

    public ProductoBase(String nombre, String descripcion, int tiempoFabricacion, int precioBase) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.personalizacionesPermitidas = new ArrayList<>();
        this.tiempoFabricacion = tiempoFabricacion;
        this.precioBase = precioBase;
    }

    public void agregarPersonalizacion(PosiblePersonalizacion posible){
        personalizacionesPermitidas.add(posible);
    }
    public String getNombre() {
        return nombre;
    }


}
