package ru.sbrf.coffee.exception;

public class OutOfWaterException extends IllegalArgumentException {
    int codeException;
    String message;

    public OutOfWaterException(int codeException, String message) {
        this.codeException = codeException;
        this.message = message;
    }
    public String getMessage(){
        return(codeException + ", " + message);
    }
}
