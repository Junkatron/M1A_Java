package lab17;

public class Submarine extends Token {

	private static int maxSpeed = 15;
	private int depth = 0;
	
	public Submarine(int x, int y, Map map) {
		super(x, y, map);
		super.setMaxSpeed(maxSpeed);
		// TODO Auto-generated constructor stub
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public void dive(int howDeep) {
		depth += howDeep;
	}
	
	public void surface() {
		depth = 0;
	}
}
