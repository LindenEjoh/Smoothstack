
public class Rectangle implements Shape {
	int length;
	int width;
	public Rectangle (int length, int width) {
		this.length=length;
		this.width=width;
	}
	@Override
	public double calculateArea() {
		return length*width;
	}
	@Override
	public void display() {
		System.out.println(calculateArea());
	}
}
