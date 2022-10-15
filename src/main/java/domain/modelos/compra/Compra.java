package domain.modelos.compra;

import domain.modelos.Item;
import domain.modelos.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "compra")
@Getter
@Setter
public class Compra extends Persistente {

    @OneToMany
    @JoinColumn(name = "compra_id", referencedColumnName = "id")
    private List<Item> items;

    @Column(name = "fecha", columnDefinition = "DATE")
    private LocalDate fecha;

    @Column(name = "hora", columnDefinition = "TIME")
    private LocalTime hora;

    @OneToMany(mappedBy = "compra")
    private List<EstadoCompra> estados;

    public Compra() {
        this.items = new ArrayList<>();
        this.estados = new ArrayList<>();
    }
}

// TODO agregar precio total en la compra
// TODO carrito en lugar de items
// TODO agregar datos para el pago
// que podriamos en los datos para el pago que tiene la compra,ya que depende de el medio de pago,estaria bien que solo guarde un string.