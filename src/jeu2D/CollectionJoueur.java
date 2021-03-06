/******************************************************
Cours:  LOG121
Projet: laboratoire 2
Nom du fichier: CollectionJoueur.java
Date créé: 2014-02-28

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou, Naim Yahyaoui
 *@date Hiver 2014
 *******************************************************/

package jeu2D;

import java.util.Iterator;
import java.util.Vector;

/**
 * Cette classe correspond � la liste de Joueur dans le jeu en question. Pour
 * stocker cette liste nous utilisons un vector de plus la classe implémente
 * Iterable
 * 
 * 
 * @param <Joueur>
 *            Nom du joueur qui va posséder la collecttion
 */
public class CollectionJoueur<Joueur> implements Iterable<Joueur> {

	// Indice du nombre de Joueur dans la collection
	private int nbJoueur;

	// Tableau contenant la liste de Joueur
	private Vector<Joueur> ListeJoueur;

	/**
	 * Constructeur par d�faut qui initialise le vector
	 */
	public CollectionJoueur() {
		ListeJoueur = new Vector<Joueur>();
		nbJoueur = 0;
	}

	/**
	 * Accesseur de l'attribut nombre joueur
	 * 
	 * @return le nombre de joueur
	 */
	public int getNbJoueur() {
		return nbJoueur;
	}

	public Vector<Joueur> getListeJoueur() {
		return ListeJoueur;
	}

	/**
	 * Permet d'ajouter un joueur dans notre liste
	 * 
	 * @param joueur
	 *            � ajouter
	 */
	public void ajouterJoueur(Joueur joueur) {
		ListeJoueur.add(joueur);
		nbJoueur++;
	}

	/**
	 * Permet de récupérer le dernier �l�ment de la liste
	 * 
	 * @return le dernier �l�ment de la liste
	 */
	public Joueur getJoueur() {
		return ListeJoueur.lastElement();

	}

	public void resetScore() {
		for (Joueur i : this) {
			((jeu2D.Joueur) i).resetScore();
		}
	}

	@Override
	public Iterator<Joueur> iterator() {
		return new Iterator<Joueur>() {

			private int currentIndex = -1;

			/**
			 * Permet de savoir s'il existe un �l�ment après l'�l�ment actuel
			 */
			@Override
			public boolean hasNext() {
				try {
					if (ListeJoueur.elementAt(currentIndex + 1) != null)
						return true;

				} catch (ArrayIndexOutOfBoundsException e) {
				}
				return false;
			}

			/**
			 * Retourne l'�l�ment suivant � la position courante
			 */
			@Override
			public Joueur next() {
				currentIndex++;
				return ListeJoueur.elementAt(currentIndex);
			}

			/**
			 * Enlàve l'élément � la position courante
			 */
			@Override
			public void remove() {

				try {
					ListeJoueur.remove(currentIndex);
					nbJoueur--;
				} catch (ClassCastException e) {
					e.printStackTrace();
				}

			}
		};
	}

}