package electricCarFactory;

public class TeslaTruck extends ElectricTruck{

    private double engineSize;

    public TeslaTruck(String model, double price, String color, double engineSize) {
        super(model, price, color);
        this.engineSize = engineSize;
    }

    @Override
    void load(String item) {
        System.out.println(String.format("Tesla truck is loaded with the item %s ", item));
    }

    @Override
    void unload() {
        System.out.println("Tesla truck is unloaded");
    }

    @Override
    void start() {
        System.out.println(String.format("Tesla truck model %s is now starting!", this.model));
    }

    @Override
    void charge() {
        System.out.println(String.format("Tesla truck  model %s is now charging!", this.model));
    }

    @Override
    void drive() {
        System.out.println(String.format("Tesla truck  model %s is now driving!", this.model));
    }

    public double getEngineSize() {
        return engineSize;
    }

    @Override
    public String toString() {
        return String.format("%s %s electric car is %s Euro with the %s engine size.", color, model, price, engineSize);
    }
}
