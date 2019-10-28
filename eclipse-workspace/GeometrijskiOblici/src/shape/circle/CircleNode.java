package shape.circle;

public class CircleNode {
	private Circle podatak;
	private CircleNode sledeci;
	
	public CircleNode(Circle podatak) {
		this.podatak = podatak;
		this.sledeci = null;
	}
	public Circle getPodatak() {
		return podatak;
	}
	public void setPodatak(Circle podatak) {
		this.podatak = podatak;
	}
	public CircleNode getSledeci() {
		return sledeci;
	}
	public void setSledeci(CircleNode sledeci) {
		this.sledeci = sledeci;
	}
}
