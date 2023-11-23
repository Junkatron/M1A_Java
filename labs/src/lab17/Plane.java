package lab17;

public class Plane extends Token {

	private static int maxSpeed = 360;
	private int height = 0;
	
	public Plane(int x, int y, Map map) {
		super(x, y, map);
		super.setMaxSpeed(maxSpeed);
		// TODO Auto-generated constructor stub
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
