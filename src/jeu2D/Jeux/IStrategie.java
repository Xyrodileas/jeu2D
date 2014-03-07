/******************************************************
Cours:  LOG121
Projet: laboratoire 2
Nom du fichier: IStrategie.java
Date créé: 2014-02-28

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou, Naim Yahyaoui
 *@date Hiver 2014
 *******************************************************/

package jeu2D.Jeux;

import jeu2D.Joueur;

/**
 * Interface statégie suivant la norme du patron stratégie
 * 
 */
public interface IStrategie {

	public void AjouterJoueur(String nomJoueur);

	public Joueur calculScoreTours();

	public Joueur calculerLeVainqueur();

	public int getNbrTours();

	public void setNbrTours(int nbrTours);
}