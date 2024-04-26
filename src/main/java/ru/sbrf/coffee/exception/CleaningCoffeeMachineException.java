package ru.sbrf.coffee.exception;

public class CleaningCoffeeMachineException extends IllegalArgumentException {
    int codeException;
    String message;
    public CleaningCoffeeMachineException(int codeException, String message) {
        this.codeException = codeException;
        this.message = message;
    }
    public String getMessage(){
        return(codeException + ", " + message);
    }
}
