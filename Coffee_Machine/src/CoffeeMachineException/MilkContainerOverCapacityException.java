package CoffeeMachineException;

public class MilkContainerOverCapacityException extends Exception {
    public MilkContainerOverCapacityException() {
    }

    @Override
    public String toString() {
        return "MilkContainerOverCapacityException{}";
    }

    public MilkContainerOverCapacityException(String message, Throwable cause) {
        super(message, cause);
    }
}
