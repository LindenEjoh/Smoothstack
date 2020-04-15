
public class Triangle implements Shape {
	int height;
	int base;
	public Triangle (int height, int base) {
		this.height=height;
		this.base=base;
	}
	@Override
	public double calculateArea() {
		return ((.5)*base*height);
	}
	@Override
	public void display() {
		System.out.println(calculateArea());
	}
}
