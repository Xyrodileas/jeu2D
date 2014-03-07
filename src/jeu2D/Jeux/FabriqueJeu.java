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
 * Created by Alexis on 07/03/14.
 */
public abstract class FabriqueJeu {

	public static Jeu NouveauJeu() {
		return new Jeu();
	}
}
