package navires;
//@ Author : Chaudet
//@ Author : Migeon

public class Element {
	private char lettre;
	private int chiffre;
	private boolean elementTouche = false;

	public Element(char lettre, int chiffre) {
		this.lettre = lettre;
		this.chiffre = chiffre;
	}

	public boolean verifierPosition(char lettre, int chiffre) {
		return this.lettre == lettre && this.chiffre == chiffre;
	}

	public boolean isElementTouche() {
		return elementTouche;
	}

	public void touche() {
		elementTouche = true;
	}

}
