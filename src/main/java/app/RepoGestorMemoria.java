package app;

import domain.modelos.Gestor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepoGestorMemoria implements RepoGestor {
    List<Gestor> gestores;

    public RepoGestorMemoria(){
        super();
        this.gestores = new ArrayList<>();
    }

    @Override
    public void save(Gestor gestor){
        gestores.add(gestor);
    }

    @Override
    public List<Gestor> all(){
        return this.gestores;
    }

    public List<Gestor> page(int nroGestor,int size){
    int desde = nroGestor*size;
        return this.gestores.subList(desde,desde + size);
    }
    @Override
    public Gestor porNombre(String nombreGestor){
        return gestores.stream().filter(x -> x.getNombre().equals(nombreGestor)).findFirst().get();    }
}
