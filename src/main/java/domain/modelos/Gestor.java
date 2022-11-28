package domain.modelos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="gestor")
@Getter
@Setter
public class Gestor extends Persistente {


    @Column(name="nombre")
    @NotBlank
    private String nombre;

    @OneToMany(mappedBy = "gestor",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private List<ProductoBase> productos;

    private boolean estaActivo;


    //En hibernate debe contener un contructor vacio...
    public Gestor(){}

    public Gestor(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoBase productoBase){
        productos.add(productoBase);
        productoBase.setGestor(this);
    }

}
