
public class Circle {

	private final double PI =3.14;
	
	private int radius;
	private String name;
		
	// default constructor / 처음 무조건 한번은 recall but 아무것도 하지는 않음
	public Circle(Circle c) {
		this.radius = c.radius;
		this.name = new String(c.name);
//		this(1, "random pizza"); // this method가 (int, string)으로 정해져 있으므로 int, string으로 구성된 constructor를 찾아감
	}
	
	public Circle(int r, String n) {
		this.initialize(r, n); 
	}
	
	private void initialize(int r, String n) {
		this.radius = r;	// setRadius(r);
		this.name = n;		// setName(n);
	}
	
	public void setRadius(int radius) {
		this.radius = radius;	// this reference : 객체의 멤버 변수와 메소드 변수의 이름이 같은 경우
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
		
	public double getPI() {
		return this.PI;
	}
		
	public double getArea() {
		return PI * radius * radius;
	}
	
	public String toString() {
		return "name : " + getName() + " radius : " + getRadius();
	}
		
	public static void main(String[] args) {
		System.out.println("Class and Object Practice");

		// code for initialization using constructor
		// creating Circle object
		Circle pizza = new Circle(15, "Hawaiian Pizza");
		System.out.println(pizza.toString());
		
		Circle pizzaCopy = new Circle(pizza);
		System.out.println(pizzaCopy.toString());
		
//		 initialization using reference variable
//		pizza.radius = 10;
//		pizza.name = "Cheese Pizza";
//		
//		// test
//		System.out.println(pizza.toString());
//		
//		// code for initialization using method
//		Circle pizza2 = new Circle();
//		
//		pizza2.initialize(8, "Chicago Pizza");
//		
//		// test
//		System.out.println(pizza2.toString());
//		
//		// code for initialization using constructor
//		Circle pizza3 = new Circle(15, "Hawaiian Pizza");
//		
//		// test
//		System.out.println(pizza3.toString());
//		
	}
}
