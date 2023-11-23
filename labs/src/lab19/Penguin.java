package lab19;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}

	@Override
	public String describeTaste() {
		return getName() + ": " + "Tough";
	}

	@Override
	public String isMainCourseDish() {
		return getName() + ": " + false;
	}

}
