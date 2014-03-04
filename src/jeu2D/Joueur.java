package jeu2D;

/**
 * La classe Joueur repr�sente les joueurs du jeu Un joueur poss�de un nom et un
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

	// D�s du joueur
	private CollectionDes ListeDes;

	/****** CONSTRUCTEUR ******/
	public Joueur(String nom) {
		this.nom = nom;
		this.score = 0;
		ListeDes = new CollectionDes();
	}

	/****** M�THODES ******/

	/****** ACCESSEURS ******/
	
	/**
	 * Permet de savoir le nombre de d�s que poss�de un joueur
	 * 
	 * @return le nombre de d� poss�d� par le joueur
	 */
	public int getNbrDes() {

		return ListeDes.getNbrDes();
	}

	/**
	 * Accesseur de la liste de d�s poss�d� par le joueur
	 * 
	 * @return la liste de d�s du joueur
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
	
	/****** AUTRES M�THODES ******/

	/**
	 * Ajoute un d� � un joueur avec un nombre de face en param�tre
	 * 
	 * @param nbrFaces
	 *            nombre de face du d� � ajout�
	 */
	public void ajouterDe(int nbrFaces) {
		ListeDes.ajouterDe(nbrFaces);
	}

    public void ajouterDe(int nbrFaces, int nbrDe){
        ListeDes.ajouterDe(nbrFaces, nbrDe);
    }

	/**
	 * Ajoute un nombre au score actuel du joueur
	 * 
	 * @param x
	 *            nombre � additionner avec le score actuel
	 */
	public void ajouterScore(int x) {
		this.score += x;
	}

	/**
	 * Permet de mettre le score d'un joueur � z�ro
	 */
	public void resetScore() {
		score = 0;
	}

	@Override
	/**
	 * Permet de comparer deux joueurs entre eux. Si ceux ci on le m�me nom et le m�me score alors ils sont consid�r� comme identique et la m�thode retourne 1 sinon lq m�thode retourne 0
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