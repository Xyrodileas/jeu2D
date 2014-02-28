package jeu2D;

public class Joueur implements Comparable {

	private String nom;
	private int score;

	private CollectionDes ListeDes;

	public Joueur(String nom) {
		this.nom = nom;
		this.score = 0;
        ListeDes = new CollectionDes();
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
	
	public String getNom(){
		return nom;
	}

	public void resetScore() {
		score = 0;
	}

	@Override
	public int compareTo(Object o) {
		Joueur joueurTemp = (Joueur)o;
		
		if((this.nom.equals(joueurTemp.nom))&&(this.score==joueurTemp.score))
			return 1;
		else
		
		return 0;
	}

}