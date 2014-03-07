/******************************************************
Cours:  LOG121
Projet: laboratoire 2
Nom du fichier: FabriqueJeu.java
Date créé: 2014-02-28

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou, Naim Yahyaoui
 *@date Hiver 2014
 *******************************************************/

package jeu2D.Jeux;

/**
 * Permet de fabriquer des instances de jeu
 *
 */
public abstract class FabriqueJeu {

	/**
	 * Retourne une instance de jeu
	 * @return instance du jeu créé
	 */
	public static Jeu NouveauJeu() {
		return new Jeu();
	}
}
