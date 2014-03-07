package jeu2D;

/**
 * Classe permettant de créer des Joueurs
 * 
 * @author David
 * 
 */
public class FabriqueJoueur {

	/**
	 * Méthode permettant de créer des Joueurs
	 * 
	 * @param nom
	 *            du joueur à créer
	 * @return le joueur créé
	 */
	public static Joueur nouveauJoueur(String nom) {
		return new Joueur(nom);
	}

}