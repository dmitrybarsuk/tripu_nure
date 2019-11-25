import models.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = getCars();

    }

    private static ArrayList<Car> getCars() {
        return new ArrayList<Car>() {{
            add(new Car("Mercedes-Benz E 320", 7500.0, 200000, 3.2));
            add(new Car("BMW X1", 13888, 178000, 2));
            add(new Car("Lexus ES 300h", 21200, 120000, 3));
            add(new Car("Volkswagen Passat CC Sport", 13500, 75000, 2));
            add(new Car("Volkswagen Passat B8 GT", 28500, 30000, 3.6));
            add(new Car("Skoda Octavia A7", 15900, 127000, 1.8));
            add(new Car("Audi S4 Lift", 23000, 150000, 3));
            add(new Car("Daewoo Lanos A/C Gur Polska", 3900, 73000, 1.5));
            add(new Car("Nissan Qashqai", 12170, 175000,1.6));
            add(new Car("Mazda RX-8", 6300, 90000, 1.3));
        }};
    }
}
