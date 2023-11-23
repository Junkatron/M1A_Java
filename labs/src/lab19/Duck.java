package lab19;

public class Duck extends Bird implements Insurable {

	public Duck(String name) {
		super(name);
	}

	@Override
	public String describeTaste() {
		return getName() + ": " + "Delicate";
	}

	@Override
	public String isMainCourseDish() {
		return getName() + ": " + true;
	}

	@Override
	public String getPremium() {
		return getName() + ": " + "Premium = £1000";
	}

	@Override
	public String expires() {
		return getName() + ": " + "Premium expires on another date";
	}

}
