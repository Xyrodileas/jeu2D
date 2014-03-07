/******************************************************
Cours:  LOG121
Projet: laboratoire 2
Nom du fichier: Joueur.java
Date créé: 2014-02-28

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou, Naim Yahyaoui
 *@date Hiver 2014
 *******************************************************/

package jeu2D;

/**
 * La classe Joueur repr�sente les joueurs du jeu Un joueur poss�de un nom et un
 * score comme attribut
 * 
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

	/****** MÉTHODES ******/

	/****** ACCESSEURS ******/

	/**
	 * Permet de savoir le nombre de dés que posséde un joueur
	 * 
	 * @return le nombre de dés possédé par le joueur
	 */
	public int getNbrDes() {

		return ListeDes.getNbrDes();
	}

	/**
	 * Accesseur de la liste de dés possédé par le joueur
	 * 
	 * @return la liste de d�s du joueur
	 */
	public CollectionDes<De> getListeDes() {
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
	 * Ajoute un dé à un joueur avec un nombre de face en paramètre
	 * 
	 * @param nbrFaces
	 *            nombre de face du dé à ajouter
	 */
	public void ajouterDe(int nbrFaces) {
		ListeDes.ajouterDe(nbrFaces);
	}

	public void ajouterDe(int nbrFaces, int nbrDe) {
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
	 * Permet de mettre le score d'un joueur à zéro
	 */
	public void resetScore() {
		score = 0;
	}

	@Override
	/**
	 * Permet de comparer deux joueurs entre eux. Si ceux ci on le m�me nom et le m�me score alors ils sont considérécomme identique et la m�thode retourne 1 sinon lq m�thode retourne 0
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