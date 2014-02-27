package jeu2D;

import java.util.Iterator;
import java.util.Vector;

@SuppressWarnings("hiding")
public class CollectionJoueur<Joueur> implements Iterable<Joueur> {

	public Vector<Joueur> ListeJoueur;

	public CollectionJoueur() {

	}

	public void ajouterJoueur(Joueur joueur) {
		ListeJoueur.add(joueur);
	}

	@Override
	public Iterator<Joueur> iterator() {
		return new Iterator<Joueur>() {

			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				if (ListeJoueur.elementAt(currentIndex) != null)
					return true;
				else
					return false;
			}

			@Override
			public Joueur next() {
				currentIndex++;
				return ListeJoueur.elementAt(currentIndex);
			}

			@Override
			public void remove() {
				ListeJoueur.remove(currentIndex);
			}
		};
	}
}