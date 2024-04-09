package Esercizio.S6L2.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException (int id) {
        super("elemento con id" + id + "non trovato");
    }
}
