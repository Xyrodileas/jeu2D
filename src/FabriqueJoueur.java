import java.util.Vector;

public class FabriqueJoueur {

    public Vector  myCollectionJoueur;
    public Vector  myJoueur;

  public static Joueur nouveauJoueur(String nom) {
    return new Joueur(nom);
  }

}