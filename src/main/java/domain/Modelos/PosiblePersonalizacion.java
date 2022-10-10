package domain.Modelos;

public class PosiblePersonalizacion {
    AreaPersonalizacion area;
    TipoPersonalizacion tipo;

    public PosiblePersonalizacion(AreaPersonalizacion area, TipoPersonalizacion tipo) {
        this.area = area;
        this.tipo = tipo;
    }

    public AreaPersonalizacion getArea() {
        return area;
    }

    public void setArea(AreaPersonalizacion area) {
        this.area = area;
    }

    public TipoPersonalizacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoPersonalizacion tipo) {
        this.tipo = tipo;
    }
}
