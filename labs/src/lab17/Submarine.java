package lab17;

public class Submarine extends Token {

	private static int maxSpeed = 15;
	private int depth = 0;
	
	private Submarine(int x, int y, Map map, int maxSpeed) {
		super(x, y, map, maxSpeed);
	}
	
	public Submarine(int x, int y, Map map) {
		this(x, y, map, maxSpeed);
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
