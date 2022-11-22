package app;

import domain.modelos.Gestor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
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
    public void save(Gestor gestor) throws GestorRepetidoException {

        if (existeGestor(gestor.getNombre())) {
            throw new GestorRepetidoException("Materia Repetida "+gestor.getNombre());
        }
        gestores.add(gestor);
    }

    @Override
    public List<Gestor> all(){
        return this.gestores;
    }

    @Override
    public Page<Gestor> page(Pageable page){
    int desde = page.getPageNumber()*page.getPageSize();
        List<Gestor> sublist = this.gestores.subList(desde,desde + page.getPageSize());
        return new PageImpl<>(sublist,page,this.gestores.size());
    }

    @Override
    public Gestor porNombre(String nombreGestor){
        return gestores.stream().filter(x -> x.getNombre().equals(nombreGestor)).findFirst().get();    }

    @Override
    public Boolean existeGestor(String nombreGestor){
        long count = gestores.stream().filter(x -> x.getNombre().equals(nombreGestor)).count();
        return count > 0;
    }
}
