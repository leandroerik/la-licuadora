package domain.controladores;

import domain.modelos.ProductoBase;
import domain.modelos.Gestor;
import domain.repositorios.RepoGestorJPA;
import domain.repositorios.RepoProductoBaseJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RepositoryRestController
public class GestorControllerComplement {
    @Autowired
    RepoGestorJPA repo;

    @Autowired
    RepoProductoBaseJPA repoProd;

    @Transactional
    @DeleteMapping("/gestores/{gestorId}") //Con el response body le indico que matchee con los tipos de lo que devuelve ,que no los use.
    public @ResponseBody ResponseEntity<Object> delete(@PathVariable("gestorId") Integer id){

        Optional<Gestor> gestorOpcional = repo.findById(id);
        if (gestorOpcional.isPresent()){
            Gestor gestor = gestorOpcional.get();
            if (gestor.isEstaActivo()){
                gestor.setEstaActivo(false);
                return ResponseEntity.ok().body(" Gestor Eliminado.");
            }else{
                return ResponseEntity.ok().body(" Gestor ya fue Eliminado.");
            }
        }
            return ResponseEntity.notFound().build();
    }

    @Transactional//Indico que si las cosas existen,tendria que encargarse de actualizarlas
    @PostMapping("/gestores/{gestorId}/productos")
    public @ResponseBody ResponseEntity<Object> agregarProductoBase
            (@PathVariable("gestorId") Integer idGestor,
             @RequestBody Integer idProducto) throws Exception{

        Optional<Gestor> gestorOpcional = repo.findById(idGestor);
        Gestor gestor = gestorOpcional.get();

        Optional<ProductoBase> productoOpcional = repoProd.findById(idProducto);
        ProductoBase producto = productoOpcional.get();


            gestor.agregarProducto(producto);

        return ResponseEntity.ok().build();
    }

}
