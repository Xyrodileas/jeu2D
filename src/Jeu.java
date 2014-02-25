import java.util.Iterator;

public class Jeu {

  private Integer nbrTours;

    public CollectionJoueur<Joueur> ListeJoueurs = new CollectionJoueur<Joueur>();

  public void calculScoreTours() {

      for(Joueur i : ListeJoueurs){
          int score = ToursBrunco(i);
          //On va ensuite ajouter le résultat au score du joueur
          i.ajouterScore(score);
          //On passe au joueur suivant

      }
  }

  // Méthode permettant de réaliser un tour de jeu pour un joueur
  private int ToursBrunco(Joueur leJoueur){
      int[] resultat = new int[leJoueur.nbrDes()];
      int index = 0;
      int score = 0; // Va contenir le score pour le tours du joueur
      for(int essai = 0; essai < 3; essai++){
          // On lance chaques dés
          for(Iterator<De> d = leJoueur.getListeDes().iterator(); d.hasNext(); index++){
              resultat[index] = d.next().LancerDe();
          }

          // On vérifier les résultats

          //Si on a 3 nombres égales, on va vérifier si c'est un brunco
          if(resultat[0] == resultat[1] && resultat[1] == resultat[2]){
              if(resultat[0] == nbrTours){ // Si c'est un brunco, on passe brunco à vrai
                  score += 21;
                  break; // On stop la boucle des essais
              }
              else
                  score += 5;
          }
          else{ // Sinon, on vérifie simplement s'il y a des points à ajouer
              resultatSansBrunco(resultat);
          }
      }
      return score;
  }

  // Méthode vérifiant le nombre de points supplémentaire à ajouter
  public int resultatSansBrunco(int[] lancers){
      int score = 0;
      for(int x : lancers){
          if(x == nbrTours){
              score += 1;
          }
      }
      return score;

    }

  public void calculerLeVainqueur() {
  }

}