package domain.modelos;

import domain.modelos.personalizacion.PosiblePersonalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;
@Entity(name="producto_base")
@Getter
@Setter
public class ProductoBase {
    @Column(name = "nombre")
    String nombre;

    @Column(name = "descripcion")
    String descripcion;

    @Transient
    List<PosiblePersonalizacion> personalizacionesPermitidas;

    @Column(name="tiempo_fabricacion")
    int tiempoFabricacion;

    @Column(name = "precio_base")
    int precioBase;


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
