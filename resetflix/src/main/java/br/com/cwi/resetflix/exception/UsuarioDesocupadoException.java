package br.com.cwi.resetflix.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

public class UsuarioDesocupadoException extends HttpStatusCodeException {

    static HttpStatus status = HttpStatus.NOT_FOUND;

    public UsuarioDesocupadoException(final String statusText) {
        super(status, statusText);
    }
}


