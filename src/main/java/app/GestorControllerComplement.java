package app;

import domain.modelos.Gestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@RepositoryRestController
public class GestorControllerComplement {
    @Autowired
    RepoGestorJPA repo;

    @Transactional
    @DeleteMapping("/gestores/{gestorId}") //Con el response body le indico que matchee con los tipos de lo que devuelve ,que no los use.
    public @ResponseBody ResponseEntity<Object> delete(@PathVariable("gestorId") Integer id){

        Optional<Gestor> gestorOpcional = repo.findById(id);
        if (gestorOpcional.isPresent()){
            gestorOpcional.get().setEstaActivo(false);
            return ResponseEntity.ok().body(" Gestor Eliminado!");
        }
            return ResponseEntity.notFound().build();
    }

}
