import java.util.Iterator;
import java.util.Vector;

public class CollectionJoueur<Joueur> implements Iterator<Joueur> {

  public Vector<Joueur> ListeJoueur;
  private iterateurJoueur iterateurJoueurs;

  public CollectionJoueur(){

  }

  public void ajouterJoueur(Joueur joueur) {
  }

    //Méthodes à implémenter
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Joueur next() {
        return null;
    }

    @Override
    public void remove() {

    }
}