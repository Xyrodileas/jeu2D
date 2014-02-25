import java.util.Iterator;

public interface iterateurJoueur<E> extends Iterator{

    @Override
    public boolean hasNext();

    @Override
    public E next();

    @Override
    public void remove();

}