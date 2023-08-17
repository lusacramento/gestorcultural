package br.com.gestorcultural.gestorcultural.exception.NotFound;

public class NotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public NotFoundException(String message) {
        super(message);
    }
}
