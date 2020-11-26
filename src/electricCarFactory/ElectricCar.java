package electricCarFactory;

public abstract class ElectricCar {
    protected String model;
    protected double price;
    protected String color;

    abstract void start();

    abstract void charge();

    abstract void drive();

    public void stop() {
        System.out.printf("Your car (%s) is now stopping!%n", model);
    }

    public ElectricCar(String model, double price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getModel(){
        return this.model;
    }

    public double getPrice(){
        return this.price;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString(){
        return String.format("%s %s electric car is %s Euro.", color, model, price);
    }
}
