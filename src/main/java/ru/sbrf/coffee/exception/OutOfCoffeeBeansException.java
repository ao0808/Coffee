package ru.sbrf.coffee.exception;

public class OutOfCoffeeBeansException extends IllegalArgumentException {
    int codeException;
    String message;

    public OutOfCoffeeBeansException(int codeException, String message) {
        this.codeException = codeException;
        this.message = message;
    }

    public String getMessage(){
        return(codeException + ", " + message);
    }
}
