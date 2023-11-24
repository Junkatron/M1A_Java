package lab17interfaces;

public class Program {

	public static void main(String[] args) {
		// Lab 17
		Map map = new Map(500, 400);
		Submarine s1 = new Submarine(10, 10, map);
		Submarine s2 = new Submarine(50, 50, map);
		Plane p1 = new Plane(100, 200, map);
		Plane p2 = new Plane(200, 300, map);
		
		displaySubDetails(s1, s2);
		
		System.out.println("Move s1 east by 2");
		if(!s1.move("east", 2))
			s1 = null;
		displaySubDetails(s1, s2);

		System.out.println("Move s1 west by 15");
		if(!s1.move("West", 15))
			s1 = null;
		displaySubDetails(s1, s2);
		
		System.out.println("Dive s2 by 20");
		s2.dive(20);
		displaySubDetails(s1, s2);

		System.out.println("Surface s2");
		s2.surface();
		displaySubDetails(s1, s2);
		
		System.out.println("Move s2 north by 16 (speed check)");
		if(!s2.move("N", 16))
			s2 = null;
		displaySubDetails(s1, s2);

		displayPlaneDetails(p1, p2);
		
		System.out.println("Move p1 north by 100");
		if(!p1.move("n", 100))
			p1 = null;
		displayPlaneDetails(p1, p2);

		System.out.println("Move p1 south by 350");
		if(!p1.move("S", 350))
			p1 = null;
		displayPlaneDetails(p1, p2);
		
		System.out.println("Climb p2 by 60");
		p2.climb(60);
		displayPlaneDetails(p1, p2);

		System.out.println("Land p2");
		p2.land();
		displayPlaneDetails(p1, p2);
		
		System.out.println("Move p2 north by 370 (speed check)");
		if(!p2.move("N", 370))
			p2 = null;
		displayPlaneDetails(p1, p2);
		
	}

	private static void displaySubDetails(Submarine sub1, Submarine sub2) {
		String tokenDetailsText = "Sub %s is at: x=%d, y=%d, depth=%d\n";
		if (sub1 != null)
			System.out.printf(tokenDetailsText, "sub1", sub1.getX(), sub1.getY(), sub1.getDepth());
		if (sub2 != null)
			System.out.printf(tokenDetailsText, "sub2", sub2.getX(), sub2.getY(), sub2.getDepth());
		System.out.println();
	}
	private static void displayPlaneDetails(Plane p1, Plane p2) {
		String tokenDetailsText = "Plane %s is at: x=%d, y=%d, height=%d\n";
		if (p1 != null)
			System.out.printf(tokenDetailsText, "plane1", p1.getX(), p1.getY(), p1.getHeight());
		if (p2 != null)
			System.out.printf(tokenDetailsText, "plane2", p2.getX(), p2.getY(), p2.getHeight());
		System.out.println();
	}

}
