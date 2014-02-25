import java.util.Iterator;

public class Jeu {

  private Integer nbrTours;

    public CollectionJoueur<Joueur> ListeJoueurs = new CollectionJoueur<Joueur>();

  public void calculScoreTours() {

      for(Joueur i : ListeJoueurs){
          int[] resultat = new int[i.nbrDes()];
          int index = 0;
          for(Iterator<De> d = i.getListeDes().iterator(); d.hasNext(); index++){
              resultat[index] = d.next().LancerDe();
          }

          //int[] resultat = new int[3];
         // for(iterateurDe d = i.getJoueur().)

      }
  }

  public void calculerLeVainqueur() {
  }

}