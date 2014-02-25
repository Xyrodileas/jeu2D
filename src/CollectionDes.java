import java.util.Iterator;
import java.util.Vector;

public class CollectionDes implements Iterator<De>{

  public Vector<De> ListeDe;


  public void ajouterDe(De de) {
  }


    // Méthodes de l'iterator à implenter
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public De next() {
        return null;
    }

    @Override
    public void remove() {

    }
}