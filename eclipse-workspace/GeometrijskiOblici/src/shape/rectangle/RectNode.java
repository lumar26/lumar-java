package shape.rectangle;

public class RectNode {
	private Rectangle podatak;
	private RectNode sledeci;
	public RectNode(Rectangle podatak) {
		super();
		this.podatak = podatak;
		this.sledeci = null;
	}
	public Rectangle getPodatak() {
		return podatak;
	}
	public void setPodatak(Rectangle podatak) {
		this.podatak = podatak;
	}
	public RectNode getSledeci() {
		return sledeci;
	}
	public void setSledeci(RectNode sledeci) {
		this.sledeci = sledeci;
	}
	
	
}
