
public class Circle implements Shape {
	int radius;
	
	public Circle (int radius) {
		this.radius=radius;
	}
	public double calculateArea() {
		return ((radius*radius)*3.14);
	}
	public void display() {
		System.out.println(calculateArea());
	}
}
