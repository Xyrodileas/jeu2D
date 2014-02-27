package jeu2D;

import java.util.Iterator;
import java.util.Vector;

public class CollectionDes implements Iterable<De> {

	public Vector<De> ListeDe;
	private int nbrDes;

	public void ajouterDe(int faces) { // TODO Modifier pour prendre en compte
										// le nombre de faces
		ListeDe.add(FabriqueDe.nouveauDe());
		setNbrDes(getNbrDes() + 1);
	}

	@Override
	public Iterator<De> iterator() { // TODO Implémenter l'itérateur
										// correctement
		return new Iterator<De>() {
			// Contient l'index de l'élément actuel
			private int currentIndex = 0;

			@Override
			public boolean hasNext() { // TODO Vérifier s'il existe un
										// élément suivant
				return true;
			}

			@Override
			public De next() { // TODO Implanter le vrai comportement
				return FabriqueDe.nouveauDe();
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
			}

		};
	}

	public int getNbrDes() {
		return nbrDes;
	}

}