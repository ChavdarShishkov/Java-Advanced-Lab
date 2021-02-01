package Lab_06_DefiningClasses.P02_CarConstructors;

import Lab_06_DefiningClasses.P01_CarInfo.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P02_CarConstructors {
    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Car> cars = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            String brand = tokens[0];
            String model = tokens[1];
            int horsePower = Integer.parseInt(tokens[2]);

            Car car = new Car(brand, model, horsePower);
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
