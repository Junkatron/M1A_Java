package lab17interfaces;

public class Plane extends Token implements Flyable {

	private static int maxSpeed = 360;
	private int height = 0;
	
	private Plane(int x, int y, Map map, int maxSpeed) {
		super(x, y, map, maxSpeed);
	}
	
	public Plane(int x, int y, Map map) {
		this(x, y, map, maxSpeed);
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void climb(int howHigh) {
		this.height += howHigh;
	}

	@Override
	public void land() {
		this.height = 0;
	}

}
