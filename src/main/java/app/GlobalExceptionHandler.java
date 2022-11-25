package app;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(GestorRepetidoException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.CONFLICT)
    String gestorRepetido(GestorRepetidoException ex ){
        return "el gestor " + ex.getNombreGestor() + "ya existe";
    }
}
