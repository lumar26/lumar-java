package shape.rectangle;

public class RectList {
	private RectNode glava;
	private int brojac = 0;

	public RectList() {
		this.glava = null;
	}

	public RectNode getPodatak() {
		return glava;
	}

	public void setPodatak(RectNode glava) {
		this.glava = glava;
	}

	public void ubaciPravougaonikUListu(Rectangle prav) {
		RectNode novi = new RectNode(prav);
		if (glava == null) {
			glava = novi;
			brojac++;
			return;
		}
			while (glava.getSledeci() != null) {
				glava = glava.getSledeci();
		}
		glava.setSledeci(novi);
		brojac++;
	}

	public void izlistajPravougaonike() {
		while (glava != null) {
			System.out.println("Pravougaonik br " + brojac + " cije su stranice jednake" + glava.getPodatak().getA()
					+ " i " + glava.getPodatak().getB() + ", a njegova povrsina je: " + glava.getPodatak().countP());
			glava = glava.getSledeci();
		}
	}

}
