package domain.repositorios;

import domain.DTOs.DTOGestor;
import domain.modelos.Gestor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

//Con excerpProjection ,defino  que proyeccion va a usar.puedehaber multiples proyecciones.
@RepositoryRestResource(path = "gestores",excerptProjection = DTOGestor.class)
public interface RepoGestorJPA extends JpaRepository<Gestor,Integer> {


    @Override
    @RestResource(exported = false)//Con esto descativo la accion de eliminar
    void deleteById(Integer id);

    @Override
    @RestResource(exported = false)
    void delete(Gestor gestor);

    //Con tan solo definir el metodo en la intefas con finBy... podes obetener esa funcionalidad,sin necesidad de implementarlo.
    Page<Gestor> findByNombre(String nombre,Pageable page);



}
