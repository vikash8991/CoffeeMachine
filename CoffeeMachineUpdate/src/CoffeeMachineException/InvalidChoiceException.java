package CoffeeMachineException;

public class InvalidChoiceException extends Exception {
    public InvalidChoiceException() {
    }

    @Override
    public String toString() {
        return "Invalid Choice Selected";
    }
}
