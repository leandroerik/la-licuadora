package domain.Modelos;

public class Personalizacion {
    String nombre;
    int precio;
    PosiblePersonalizacion categoria;
    String contenido;

    public Personalizacion(String nombre, int precio, PosiblePersonalizacion categoria, String contenido) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public PosiblePersonalizacion getCategoria() {
        return categoria;
    }

    public void setCategoria(PosiblePersonalizacion categoria) {
        this.categoria = categoria;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
