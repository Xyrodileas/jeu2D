package jeu2D;

/**
 * Classe permettant de cr�er des Joueurs
 * 
 * @author David
 * 
 */
public class FabriqueJoueur {

	/**
	 * M�thode permettant de cr�er des Joueurs
	 * 
	 * @param nom
	 *            du joueur � cr�er
	 * @return le joueur cr��
	 */
	public static Joueur nouveauJoueur(String nom) {
		return new Joueur(nom);
	}

}