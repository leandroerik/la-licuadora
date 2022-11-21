package app;

import domain.modelos.Gestor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoGestor {

    public void save(Gestor algo);

    public List<Gestor> all();

    public List<Gestor> page(int nroGestor,int size);

    Gestor porNombre(String nombreGestor);
}
