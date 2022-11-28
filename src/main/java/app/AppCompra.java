package app;

import domain.modelos.Gestor;
import domain.modelos.ProductoBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@EntityScan("domain.modelos")
public class AppCompra {
    //Autowired trae cosas que no estan en el bean.
    @Autowired
    RepositoryRestConfiguration config;

    public static void main(String[] args) {
        SpringApplication.run(AppCompra.class, args);
    }

    @Bean
    public CommandLineRunner init(RepoProductoBaseJPA repoProd,RepoGestorJPA repo){
        config.exposeIdsFor(Gestor.class);
        config.exposeIdsFor(ProductoBase.class);

        return (cosas) -> {
            Gestor erik = new Gestor("ERIK");
            ProductoBase unProducto = new ProductoBase("Gorra");
            erik.agregarProducto(unProducto);

            repo.save(erik);
            repo.save(new Gestor("JORGE"));
            repo.save(new Gestor("DANILO"));
            repo.save(new Gestor("TEO"));

            repoProd.save(unProducto);

        };
    }
}
