package jeu2D;

/**
 * La classe Joueur représente les joueurs du jeu Un joueur possède un nom et un
 * score comme attribut
 * 
 * @author David
 * 
 */
public class Joueur implements Comparable {

	/****** ATTRIBUTS ******/
	// nom du Joueur
	private String nom;

	// score du joueur
	private int score;

	// Dés du joueur
	private CollectionDes ListeDes;

	/****** CONSTRUCTEUR ******/
	public Joueur(String nom) {
		this.nom = nom;
		this.score = 0;
		ListeDes = new CollectionDes();
	}

	/****** MÉTHODES ******/

	/****** ACCESSEURS ******/
	
	/**
	 * Permet de savoir le nombre de dés que possède un joueur
	 * 
	 * @return le nombre de dé possédé par le joueur
	 */
	public int getNbrDes() {

		return ListeDes.getNbrDes();
	}

	/**
	 * Accesseur de la liste de dés possédé par le joueur
	 * 
	 * @return la liste de dés du joueur
	 */
	public CollectionDes getListeDes() {
		return this.ListeDes;
	}

	/**
	 * Accesseur de l'attribut score
	 * 
	 * @return le score actuel du joueur en question
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Accesseur du nom du joueur
	 * 
	 * @return le nom du joueur en question
	 */
	public String getNom() {
		return nom;
	}
	
	/****** AUTRES MÉTHODES ******/

	/**
	 * Ajoute un dé à un joueur avec un nombre de face en paramètre
	 * 
	 * @param nbrFaces
	 *            nombre de face du dé à ajouté
	 */
	public void ajouterDe(int nbrFaces) {
		ListeDes.ajouterDe(nbrFaces);
	}

	/**
	 * Ajoute un nombre au score actuel du joueur
	 * 
	 * @param x
	 *            nombre à additionner avec le score actuel
	 */
	public void ajouterScore(int x) {
		this.score += x;
	}

	/**
	 * Permet de mettre le score d'un joueur à zéro
	 */
	public void resetScore() {
		score = 0;
	}

	@Override
	/**
	 * Permet de comparer deux joueurs entre eux. Si ceux ci on le même nom et le même score alors ils sont considéré comme identique et la méthode retourne 1 sinon lq méthode retourne 0
	 */
	public int compareTo(Object o) {
		Joueur joueurTemp = (Joueur) o;

		if ((this.nom.equals(joueurTemp.nom))
				&& (this.score == joueurTemp.score))
			return 1;
		else

			return 0;
	}

}