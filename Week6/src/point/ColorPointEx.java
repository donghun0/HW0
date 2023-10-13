package point;

public class ColorPointEx{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p = new MyPoint(); // Create MyPoint object
		p.set(1, 2);				// Call set() of MyPoint class
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();	// Object of ColorPoint
		cp.set(3,4);			// Call set() of MyPoint class
		cp.setColor("red");		// Call setColor() of ColorPoint class
		cp.showColorPoint();	// Print color and coordination

	}

}
