package exceptions;

public class NegativeInputException extends Exception {
    public NegativeInputException(){
        this("Input must be greater or equal to zero");
    }
    public NegativeInputException(String message){
        super(message);
    }
}
