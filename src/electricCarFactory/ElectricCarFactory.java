package electricCarFactory;

import java.util.ArrayList;
import java.util.List;

public class ElectricCarFactory {
    public static void main(String[] args) {
        Ford f1 = new Ford("Focus", 45000, "Blue", 2005);
        Ford f2 = new Ford("Taunus", 4000, "Green", 1975);
        Tesla t1 = new Tesla("S", 40000, "Orange");
        Tesla t2 = new Tesla("X", 50000, "Orange");
        Tesla t3 = new Tesla("SX", 60000, "Orange");
        System.out.println(t3);
        TeslaTruck tr1 = new TeslaTruck("KX", 70000, "Black", 2000.00);

        List<ElectricCar> electricCars = new ArrayList<>();
        electricCars.add(f1);
        electricCars.add(f2);
        electricCars.add(t1);
        electricCars.add(t2);
        electricCars.add(t3);
        electricCars.add(tr1);

        driveAllCars(electricCars);
        totalPrice(electricCars);
    }

    public static void driveAllCars(List<ElectricCar> cars) {
        for (ElectricCar car : cars) {
            car.drive();
        }
    }

    public static void totalPrice(List<ElectricCar> cars) {
        int totalPrice = 0;
        for (ElectricCar car : cars) {
            totalPrice += car.getPrice();
        }
        System.out.printf("Total price of the electrical cars in the factory is %s Euro. %n", totalPrice);
    }
}


