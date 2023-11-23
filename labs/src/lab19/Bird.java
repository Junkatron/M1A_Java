package lab19;

public abstract class Bird extends Animal implements Consumable {
	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Bird(String name) {
		this.name = name;
		super.animalType = AnimalType.Bird;
	}
}
