package lab19;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// Lab 19

		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		Duck aDuck = new Duck("A Duck");
		Penguin aPenguin = new Penguin("A Penguin");
		Fish aFish = new Fish("A Fish");
		
		animals.add(aDuck);
		animals.add(aPenguin);
		animals.add(aFish);
		
		for (Animal animal : animals) {
			if (animal instanceof Consumable) {
				Consumable c = (Consumable) animal;
				System.out.println(c.describeTaste());
				System.out.println(c.isMainCourseDish());
			}
		}
		
		for (Animal animal : animals) {
			if (animal instanceof Insurable) {
				Insurable ins = (Insurable) animal;
				System.out.println(ins.getPremium());
				System.out.println(ins.expires());
			}
		}

	}

}
