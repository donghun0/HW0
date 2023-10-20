package point;

class Mypoint {
	private int x, y;
	
	public Mypoint() {
		this.x = x;
		this.y = y;
	}
	public Mypoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Mypoint{
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);;
		showPoint();
	}
}