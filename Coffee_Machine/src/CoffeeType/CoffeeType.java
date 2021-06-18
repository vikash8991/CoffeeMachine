package CoffeeType;

public enum CoffeeType {
	 LATTE(10, 5),ESPRESSO(75, 9),CAPPUCCINO(100, 10),LONGBLACK(80,18),FILTERCOFFEE(34,30);
    
    private final int milk;
    private final int beans;
    
    CoffeeType(int milk, int beans) {
        this.milk = milk;
        this.beans = beans;
    }
    public int getMilk() {
        return this.milk;
    }
    public int getBeans() {
        return this.beans;
    }

}

