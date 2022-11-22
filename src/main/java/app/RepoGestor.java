package app;

import domain.modelos.Gestor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoGestor {

    public void save(Gestor algo) throws GestorRepetidoException;

    public List<Gestor> all();

    public Page<Gestor> page(Pageable page);

    Gestor porNombre(String nombreGestor);

    public Boolean existeGestor(String nombreGestor);
}
