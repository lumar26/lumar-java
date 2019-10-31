package shape;

public class Square  implements Shape{
	private double a;

	public Square(double a) {
		super();
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double countP() {
		// TODO Auto-generated method stub
		return 4*a;
	}

	@Override
	public double countS() {
		
		return a*a;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return " Square ";
	}
	
}
