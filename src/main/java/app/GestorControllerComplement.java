package app;

import domain.modelos.Gestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@RepositoryRestController
public class GestorControllerComplement {
    @Autowired
    RepoGestorJPA repo;
    //Con el response body le indico que matchee con los tipos de lo que devuelve ,que no los use.
    @DeleteMapping("/gestores/{gestorId}")
    public @ResponseBody String delete(@PathVariable("gestorId") Integer id){
        Optional<Gestor> gestorOpcional = repo.findById(id);
        gestorOpcional.get().setEstaActivo(false);
        return "se elimino";
    }

}
