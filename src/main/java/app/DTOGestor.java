package app;

import domain.modelos.Gestor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "gestor1",types = Gestor.class)
public interface DTOGestor {
    //la proyeccion hace que muestre los valores de una ,no separas los datos como nombre y apell,sino que mostrarlo junto.

    @Value("#{target.nombre}")
    String getNombreCompleto();

    @Value("#{target.productos.size()}")
    int getCantProductos();
}