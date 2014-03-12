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
    /**
     * Méthode permettant d'ajouter un joueur
     * @param nomJoueur
     */
	public void AjouterJoueur(String nomJoueur);

    /**
     * Méthode de calcul du score d'un joueur
     * @return
     */
	public Joueur calculScoreTours();

    /**
     * Méthode de calcul du vainqueur
     * @return
     */
	public Joueur calculerLeVainqueur();

    /**
     * Méthode permettant de récupérer le numéro du tour
     * @return
     */
	public int getNbrTours();

    /**
     * Méthode permettant de changer le numéro du tour
     * @param nbrTours
     */
	public void setNbrTours(int nbrTours);
}