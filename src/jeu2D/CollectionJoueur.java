package jeu2D;

import java.util.Iterator;
import java.util.Vector;

public class CollectionJoueur<Joueur> implements Iterable<Joueur> {

  public Vector<Joueur> ListeJoueur;
  private iterateurJoueur iterateurJoueurs;

  public CollectionJoueur(){

  }

  public void ajouterJoueur(Joueur joueur) {
  }


    @Override
    public Iterator<Joueur> iterator() {
        return new Iterator<Joueur>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() { //TODO Vérifier qu'il existe
                return true;
            }

            @Override
            public Joueur next() {
                currentIndex +=1;
                return ListeJoueur.elementAt(currentIndex);
            }

            @Override
            public void remove() {
                // TODO Auto-generated method stub
            }
        };
    }
}