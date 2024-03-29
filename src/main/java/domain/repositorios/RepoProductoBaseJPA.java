package domain.repositorios;

import domain.modelos.Gestor;
import domain.modelos.ProductoBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "productos")
public interface RepoProductoBaseJPA extends JpaRepository<ProductoBase,Integer> {
    @Override
    @RestResource(exported = false)
    void deleteById(Integer id);

    @Override
    @RestResource(exported = false)
    void delete(ProductoBase producto);

}
