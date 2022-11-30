package domain.Validaciones;

import javax.validation.constraints.NotBlank;

public class GestorRepetidoException extends Exception {
    private String nombreGestor;

    public String getNombreGestor() {
        return nombreGestor;
    }

    public GestorRepetidoException(@NotBlank String s) {
        nombreGestor = s;
    }

    public GestorRepetidoException(String message, Throwable cause) {
        super(message, cause);
        nombreGestor = message;
    }

    public GestorRepetidoException(Throwable cause) {
        super(cause);
    }

    public GestorRepetidoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public GestorRepetidoException() {
    }
}
