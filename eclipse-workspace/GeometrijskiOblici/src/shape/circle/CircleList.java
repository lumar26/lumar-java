package shape.circle;

public class CircleList {
	private CircleNode glava;
	private int brojac;

	public CircleList() {
		glava = null;
		brojac = 0;
	}

	public void ubaciUListu(Circle novi) {
		CircleNode n = new CircleNode(novi);
		if (glava == null) {
			glava = n;
			brojac++;
			return;
		}
		while (glava.getSledeci() != null) {
			glava = glava.getSledeci();
		}
		glava.setSledeci(n);
		brojac++;

	}

	public void izlistajKrugove() {
		while (glava != null) {
			System.out.println("Krug broj: " + brojac + " ciji je poluprecnik: " + glava.getPodatak().getR()
					+ " i cija je povrsina jednaka: " + glava.getPodatak().countP());
			glava = glava.getSledeci();
		}
	}

}
