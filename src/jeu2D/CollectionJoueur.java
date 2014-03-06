package jeu2D;

import java.util.Iterator;
import java.util.Vector;

/**
 * Cette classe correspond � la liste de Joueur dans le jeu en question. Pour
 * stocker cette liste nous utilisons un vector de plus la classe impl�mente
 * Iterable
 * 
 * @author David
 * 
 * @param <Joueur>
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
	
	public Vector<Joueur>  getListeJoueur(){ //TODO A TESTER
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
	 * Permet de r�cup�rer le dernier �l�ment de la liste
	 * @return le dernier �l�ment de la liste
	 */
	public Joueur getJoueur(){
		return ListeJoueur.lastElement();
		
	}

	@Override
	public Iterator<Joueur> iterator() {
		return new Iterator<Joueur>() {

			private int currentIndex = -1;

			/**
			 * Permet de savoir s'il exite un �l�ment apr�s l'�l�ment actuel
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
			 * Enl�ve l'�l�ment � la position courante
			 */
			@Override
			public void remove() { //TODO Tester

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