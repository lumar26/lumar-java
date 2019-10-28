package shape.circle;

import java.util.Scanner;

public class Circle {
	public Circle(double r) {
		this.r = r;
	}

	private double r;
	
	public double countP() {
		return r*r*Math.PI;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public void unesiKrug() {
		Scanner s = new Scanner(System.in);
		this.r = s.nextDouble();
		s.close();
	}
	
	
	
}
