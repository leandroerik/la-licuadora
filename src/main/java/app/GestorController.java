package app;

import domain.modelos.Gestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gestores")
/*Aca inidico que es el recurso osea la base*/
public class GestorController {

    @Autowired
    RepoGestor repo;
    /*esto es la query string*/
    @GetMapping(path = {"/",""})
    public List<Gestor> gestores(@RequestParam(value = "page",required = false,defaultValue = "0") Integer page){

        return repo.page(page,2);
        // lo que hace el all() , es paginarlo
    }

    @GetMapping("/{nombreGestor}")
    public Gestor obtenerGestor(@PathVariable("nombreGestor") String nombreGestor ){
        return repo.porNombre(nombreGestor);
    }
}
