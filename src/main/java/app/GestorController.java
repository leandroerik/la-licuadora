package app;

import domain.modelos.Gestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gestores")
/*Aca inidico que es el recurso osea la base*/
public class GestorController {

    @Autowired
    RepoGestor repo;
    /*esto es la query string*/
    @GetMapping("/")
    public List<Gestor> gestores(){

        return repo.page(1,2);
        // lo que hace el all() , es paginarlo
    }

    @GetMapping("/{nombreGestor}")
    public Gestor obtenerGestor(@PathVariable("nombreGestor") String nombreGestor ){
        return repo.porNombre(nombreGestor);
    }
}
