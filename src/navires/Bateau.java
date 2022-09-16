package navires;
// @ Author : Chaudet
// @ Author : Migeon

public class Bateau {
	private String nom;
	private int tailleBateau;

	public Bateau(String nom, int tailleBateau) {
		this.nom = nom;
		this.tailleBateau = tailleBateau;
	}

	public int getTailleBateau() {
		return tailleBateau;
	}
	
	public String getNom() {
		return nom;
	}
}
