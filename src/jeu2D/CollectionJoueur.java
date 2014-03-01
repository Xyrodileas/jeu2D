package jeu2D;

import java.util.Iterator;
import java.util.Vector;

/**
 * Cette classe correspond à la liste de Joueur dans le jeu en question. Pour
 * stocker cette liste nous utilisons un vector de plus la classe implémente
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
	 * Constructeur par défaut qui initialise le vector
	 */
	public CollectionJoueur() {
		ListeJoueur = new Vector<Joueur>();
	}

	/**
	 * Accesseur de l'attribut nombre joueur
	 * 
	 * @return le nombre de joueur
	 */
	public int getNbJoueur() {
		return nbJoueur;
	}
	
	public Vector<Joueur>  getListeJoueur(){
		return ListeJoueur;
	}

	/**
	 * Permet d'ajouter un joueur dans notre liste
	 * 
	 * @param joueur
	 *            à ajouter
	 */
	public void ajouterJoueur(Joueur joueur) {
		ListeJoueur.add(joueur);
		nbJoueur++;
	}
	
	/**
	 * Permet de récupérer le dernier élément de la liste
	 * @return le dernier élément de la liste
	 */
	public Joueur getJoueur(){
		return ListeJoueur.lastElement();
		
	}

	@Override
	public Iterator<Joueur> iterator() {
		return new Iterator<Joueur>() {

			private int currentIndex = 0;

			/**
			 * Permet de savoir s'il exite un élément après l'élément actuel
			 */
			@Override
			public boolean hasNext() {
				boolean next = false;
				try {
					if (ListeJoueur.elementAt(currentIndex + 1) != null)
						next = true;
					else
						next = false;
				} catch (ArrayIndexOutOfBoundsException e) {

				}
				return next;

			}
			


			/**
			 * Retourne l'élément suivant à la position courante
			 */
			@Override
			public Joueur next() {
				currentIndex++;
				return ListeJoueur.elementAt(currentIndex);
			}

			/**
			 * Enlève l'élément à la position courante
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