package jeu2D;

public class Joueur implements Comparable {

	public String nom;
	private int score;

	private CollectionDes ListeDes;

	public Joueur(String nom) {
		this.nom = nom;
		this.score = 0;
	}

	public void ajouterScore(int x) {
		this.score += x;
	}

	public int nbrDes() {
		
		return ListeDes.getNbrDes();
	}

	public void ajouterDe(int nbrFaces) {
		ListeDes.ajouterDe(nbrFaces);
	}

	public CollectionDes getListeDes() {
		return this.ListeDes;
	}

	public int getScore() {
		return score;
	}

	public void resetScore() {
		score = 0;
	}

	@Override
	public int compareTo(Object o) {
//		if(this.nom.equals((Joueur)o.nom))
		
		return 0;
	}

}