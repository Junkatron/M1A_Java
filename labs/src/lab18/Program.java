package lab18;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		// Lab 18 part 1
		ArrayList<Car> cars = new ArrayList<Car>();
		Car car1 = new Car("model T", 0);
		cars.add(car1);
		Car car2 = new Car("model X", 0);
		cars.add(car2);
		RacingCar rCar1 = new RacingCar("Super A", 0, "Driver A", 2);
		cars.add(rCar1);
		RacingCar rCar2 = new RacingCar("Super B", 0, "Driver B", 3);
		cars.add(rCar2);
		processCars(cars);
	}

	public static void processCars(ArrayList<Car> cars) {
		for (Car c : cars) {
			c.getToSixty();
			c.accelerate(2);
			System.out.printf("Car model: %s, speed: %d ", c.getModel(), c.getSpeed());
			if (c instanceof RacingCar) {
				RacingCar rc = (RacingCar) c;
				System.out.printf(", driver: %s", rc.getDriver());
			}
			System.out.println("");
		}
	}
}
