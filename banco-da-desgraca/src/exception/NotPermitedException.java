package exception;

public class NotPermitedException extends RuntimeException {

    public NotPermitedException(String mensagemDeErro) {

        super(mensagemDeErro);
    }
}