package electricCarFactory;

public class Ford extends ElectricCar {

    private int year;

    public Ford(String model, double price, String color, int year) {
        super(model, price, color);
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    void start() {
        System.out.println(String.format("Ford model %s is now starting!", this.model));
    }

    @Override
    void charge() {
        System.out.println(String.format("Ford model %s is now charging!", this.model));
    }

    @Override
    void drive() {
        System.out.println(String.format("Ford model %s is now driving!", this.model));
    }

    @Override
    public String toString() {
        return String.format("%s %s electric car is %s Euro and produced in %s.", color, model, price, year);
    }
}
