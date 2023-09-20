package domain.repositorios;

import domain.modelos.Gestor;
import domain.modelos.personalizacion.PosiblePersonalizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface PosiblePersonalizacionJPA extends JpaRepository<PosiblePersonalizacion,Integer> {
    @Override
    @RestResource(exported = false)
    void deleteById(Integer id);

    @Override
    @RestResource(exported = false)
    void delete(PosiblePersonalizacion posiblePersonalizacion);

}
