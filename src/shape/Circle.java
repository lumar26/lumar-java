package shape;

public class Circle implements Shape{
	private double r;
	
	

	public Circle() {
		super();
		r = 0.0;
	}



	public Circle(double radius) {
		super();
		this.r = radius;
	}



	@Override
	public double countP() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}



	@Override
	public double countS() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}



	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return " Circle ";
	}
	
	
}
