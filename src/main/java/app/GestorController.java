package app;

import domain.modelos.Gestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/gestores")
/*Aca inidico que es el recurso osea la base*/
public class GestorController {

    @Autowired
    RepoGestor repo;
    /*esto es la query string*/
    @GetMapping(path = {"/",""})
    //Usamos el page del spring para mostrar solo lo necesario.
    public Page<Gestor> gestores(Pageable page){
        //Por default toma como primera pagina al 0,por quqery params le paso el size.
        return repo.page(page);
        // lo que hace el all() , es paginarlo
    }

    @GetMapping("/{nombreGestor}")
    public Gestor obtenerGestor(@PathVariable("nombreGestor") String nombreGestor ){
        return repo.porNombre(nombreGestor);
    }

    //Dar de ALTA a un gestor
    @PostMapping("/")
    public String alta(@RequestBody @Valid Gestor gestor, BindingResult binding){
        binding.hasErrors();
        if (binding.hasErrors()) {
            return "not ok";
        }else {
            repo.save(gestor);
            return "ok";
        }
    }
}
