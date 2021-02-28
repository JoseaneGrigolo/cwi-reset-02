package br.com.cwi.reset.exemploreset.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

public class BadRequestException extends HttpStatusCodeException {

    public BadRequestException() {
        super(HttpStatus.BAD_REQUEST);


    }
}