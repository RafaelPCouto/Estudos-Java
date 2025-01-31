package isiflix.exceptions;

// Inicialmente, vamos utilizar uma exceção não verificada
public class IsiException extends RuntimeException {
    public IsiException(String mensagem) {
        super(mensagem);
    }
}
