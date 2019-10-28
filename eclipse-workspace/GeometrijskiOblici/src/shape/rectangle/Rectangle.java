package shape.rectangle;

public class Rectangle {
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	private double a, b;
	
	
	public double countP() {
		return a*b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
}
