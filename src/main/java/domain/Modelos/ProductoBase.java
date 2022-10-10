package domain.Modelos;

import java.util.ArrayList;
import java.util.List;

public class ProductoBase {
    String nombre;
    String descripcion;
    List<PosiblePersonalizacion> personalizacionesPermitidas;
    int tiempoFabricacion;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<PosiblePersonalizacion> getPersonalizacionesPermitidas() {
        return personalizacionesPermitidas;
    }

    public void setPersonalizacionesPermitidas(List<PosiblePersonalizacion> personalizacionesPermitidas) {
        this.personalizacionesPermitidas = personalizacionesPermitidas;
    }

    public int getTiempoFabricacion() {
        return tiempoFabricacion;
    }

    public void setTiempoFabricacion(int tiempoFabricacion) {
        this.tiempoFabricacion = tiempoFabricacion;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
}
