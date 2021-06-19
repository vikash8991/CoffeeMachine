package CoffeeMachineException;

public class BeanContainerOverCapacityException extends Exception {
	    @Override
	    public String toString() {
	        return "Beans container is full and you cannot add more beans";
	    }

	    public BeanContainerOverCapacityException() {
	    }

	    public BeanContainerOverCapacityException(String message, Throwable cause) {
	        super(message, cause);
	    }
	}

