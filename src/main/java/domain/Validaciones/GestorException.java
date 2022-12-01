package domain.Validaciones;

import domain.modelos.ProductoBase;
import domain.modelos.Gestor;

public class GestorException extends Exception{
    private  Gestor materia;
    private ProductoBase producto;

    public GestorException() {
        super();
    }

    public GestorException(String message, Gestor gestor, ProductoBase producto) {
        super(message);
        this.materia = materia;
        this.producto = producto;
    }

    public GestorException(String message, Throwable cause) {
        super(message, cause);
    }

    public GestorException(Throwable cause) {
        super(cause);
    }

    public GestorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
