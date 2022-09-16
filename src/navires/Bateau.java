package navires;
// @ Author : Chaudet
// @ Author : Migeon

public class Bateau {
	private String nom;
	private int tailleBateau;
	private Element[] elements;

	public Bateau(String nom, int tailleBateau) {
		this.nom = nom;
		this.tailleBateau = tailleBateau;
		elements = new Element[tailleBateau];
	}

	public int getTailleBateau() {
		return tailleBateau;
	}
	
	public String getNom() {
		return nom;
	}
}
