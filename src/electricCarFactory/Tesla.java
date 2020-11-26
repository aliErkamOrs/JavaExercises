package electricCarFactory;

public class Tesla extends ElectricCar{

    public Tesla(String model, double price, String color) {
        super(model, price, color);
    }

    @Override
    void start() {
        System.out.println(String.format("Tesla model %s is now starting!", this.model));
    }

    @Override
    void charge() {
        System.out.println(String.format("Tesla model %s is now charging!", this.model));
    }

    @Override
    void drive() {
        System.out.println(String.format("Tesla model %s is now driving!", this.model));
    }
}
