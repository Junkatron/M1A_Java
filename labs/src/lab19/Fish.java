package lab19;

public class Fish extends Animal implements Consumable, Insurable {
	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Fish(String name) {
		this.name = name;
		super.animalType = AnimalType.Fish;
	}
	
	@Override
	public String describeTaste() {
		return getName() + ": " + "Fishy";
	}

	@Override
	public String isMainCourseDish() {
		return getName() + ": " + true;
	}

	@Override
	public String getPremium() {
		return getName() + ": " + "Premium = £100";
	}

	@Override
	public String expires() {
		return getName() + ": " + "Premium expires on some date";
	}

}
