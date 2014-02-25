import java.util.Vector;

public class FabriqueJoueur {

    public Vector  myCollectionJoueur;
    public Vector  myJoueur;

  public static Joueur nouveauJoueur() {
  return new Joueur();
  }

}