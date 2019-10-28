package shape.square;

public class Square {
	public Square(double a) {
		super();
		this.a = a;
	}
	private double a;
	
	public double countP() {
		return a*a;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

}
