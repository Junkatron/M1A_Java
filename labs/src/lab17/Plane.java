package lab17;

public class Plane extends Token {

	private static int maxSpeed = 360;
	private int height = 0;
	
	private Plane(int x, int y, Map map, int maxSpeed) {
		super(x, y, map, maxSpeed);
	}
	
	public Plane(int x, int y, Map map) {
		this(x, y, map, maxSpeed);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void climb(int howHigh) {
		this.height += howHigh;
	}
	
	public void land() {
		this.height = 0;
	}
}
