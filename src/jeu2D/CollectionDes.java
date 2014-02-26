package jeu2D;

import java.util.Iterator;
import java.util.Vector;

public class CollectionDes implements Iterable<De>{

    public Vector<De> ListeDe;
    public int nbrDes;

    public void ajouterDe(int faces) { //TODO Modifier pour prendre en compte le nombre de faces
        ListeDe.add(FabriqueDe.FabriqueDe());
        nbrDes += 1;
    }


    @Override
    public Iterator<De> iterator() { //TODO Implémenter l'itérateur correctement
        return new Iterator<De>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public De next() {
                return FabriqueDe.FabriqueDe();
            }

            @Override
            public void remove() {
                // TODO Auto-generated method stub
            }
        };
    }
}