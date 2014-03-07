/******************************************************
Cours:  LOG121
Projet: laboratoire 2
Nom du fichier: FabriqueJoueur.java
Date créé: 2014-02-28

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou, Naim Yahyaoui
 *@date Hiver 2014
 *******************************************************/

package jeu2D;

/**
 * Classe permettant de créer des Joueurs
 */
public class FabriqueJoueur {

	/**
	 * Méthode permettant de retourner une instance de joueur
	 * 
	 * @param nom
	 *            du joueur à créer
	 * 
	 * @return le joueur créé
	 */
	public static Joueur nouveauJoueur(String nom) {
		return new Joueur(nom);
	}

}