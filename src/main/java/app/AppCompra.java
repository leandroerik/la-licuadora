package app;

import domain.modelos.Gestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppCompra {
/*TODO:Con el autowired le digo que si o si use repoGestor(lo busca dentro del paquete en el cual esta parado! 1:54 VIDEO 13)*/
    @Autowired
    private RepoGestor repo;

    public static void main(String[] args) {
        SpringApplication.run(AppCompra.class, args);
    }

    @Bean
    public CommandLineRunner ejemplo(){
        return (cosas) -> {
            repo.save(new Gestor("ERIK"));
            repo.save(new Gestor("JORGE"));
            repo.save(new Gestor("DANILO"));
            repo.save(new Gestor("TEO"));
        };
    }
}
