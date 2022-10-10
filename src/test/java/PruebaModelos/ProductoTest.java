package PruebaModelos;

import domain.Modelos.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductoTest {
    @Test
    public void testProductoBaseOK(){
        ProductoBase producto = new ProductoBase("Remera","remera con logo de USA",22,50);

        AreaPersonalizacion delantero = new AreaPersonalizacion("parte delantera de la ropa");
        TipoPersonalizacion estampa = new TipoPersonalizacion("una estampa clasica");

        PosiblePersonalizacion nuevaTemporada = new PosiblePersonalizacion(delantero,estampa);

        producto.agregarPersonalizacion(nuevaTemporada);

        //Pruebo que tenga alguna posible personalizacion permitida
        assertTrue( producto.getPersonalizacionesPermitidas().contains(nuevaTemporada));
    }
    @Test
    public void testGestorOK(){
        Gestor gestor = new Gestor("Erik");

        ProductoBase producto = new ProductoBase("Remera","remera con logo de USA",22,50);

        gestor.agregarProducto(producto);
        //Pruebo que el gestor tenga algun producto
        assertTrue( gestor.getProductos().contains(producto));
    }

    @Test
    public void productoPersonalizadoOK(){
        ProductoBase producto = new ProductoBase("Remera","remera con logo de USA",22,50);

        AreaPersonalizacion delantero = new AreaPersonalizacion("parte delantera de la ropa");
        TipoPersonalizacion estampa = new TipoPersonalizacion("una estampa clasica");
        PosiblePersonalizacion temporada = new PosiblePersonalizacion(delantero,estampa);

        Personalizacion estampaUSA = new Personalizacion("estampado usa",100,temporada,"USA");


        ProductoPersonalizado productoPersonalizado = new ProductoPersonalizado(producto);

        productoPersonalizado.agregarPersonalizacion(estampaUSA);

        assertTrue(productoPersonalizado.getPersonalizaciones().contains(estampaUSA));

    }
}
