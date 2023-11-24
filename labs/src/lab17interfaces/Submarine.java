package lab17interfaces;

public class Submarine extends Token implements Submersible {

	private static int maxSpeed = 15;
	private int depth = 0;
	
	private Submarine(int x, int y, Map map, int maxSpeed) {
		super(x, y, map, maxSpeed);
	}
	
	public Submarine(int x, int y, Map map) {
		this(x, y, map, maxSpeed);
	}

	@Override
	public int getDepth() {
		return depth;
	}

	@Override
	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public void dive(int howDeep) {
		depth += howDeep;
	}

	@Override
	public void surface() {
		depth = 0;
	}

}
