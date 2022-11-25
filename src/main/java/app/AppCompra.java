package app;

import domain.modelos.Gestor;
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

    @Autowired
    RepositoryRestConfiguration config;

/*TODO:Con el autowired le digo que si o si use repoGestor(lo busca dentro del paquete en el cual esta parado! 1:54 VIDEO 13)*/
    @Autowired
    private RepoGestorJPA repo;

    public static void main(String[] args) {
        SpringApplication.run(AppCompra.class, args);
    }

    @Bean
    public CommandLineRunner ejemplo(){
        config.exposeIdsFor(Gestor.class);

        return (cosas) -> {
            repo.save(new Gestor("ERIK"));
            repo.save(new Gestor("JORGE"));
            repo.save(new Gestor("DANILO"));
            repo.save(new Gestor("TEO"));
        };
    }
}
