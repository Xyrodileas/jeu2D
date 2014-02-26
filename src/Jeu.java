import java.util.Iterator;

public class Jeu {

    private Integer nbrTours;

    private CollectionJoueur<Joueur> ListeJoueurs = new CollectionJoueur<Joueur>();

    public Jeu(){
        nbrTours = 0;
    }
    public void AjouterJoueur(String nomJoueur){
        ListeJoueurs.ajouterJoueur(FabriqueJoueur.nouveauJoueur(nomJoueur));
    }

    public void calculScoreTours() {
        nbrTours +=1;
        for(Joueur i : ListeJoueurs){
            int score = ToursBrunco(i);
            //On va ensuite ajouter le résultat au score du joueur
            i.ajouterScore(score);
            //On passe au joueur suivant

        }

    }

    // Méthode permettant de réaliser un tour de jeu pour un joueur
    private int ToursBrunco(Joueur leJoueur){
        int[] resultat;
        int score = 0; // Va contenir le score pour le tours du joueur
        for(int essai = 0; essai < 3; essai++){
            // On lance chaques dés
            resultat = lancerLesDes(leJoueur);

            // On vérifier les résultats

            //Si on a 3 nombres égales, on va vérifier si c'est un brunco
            if(resultat[0] == resultat[1] && resultat[1] == resultat[2]){
                if(resultat[0] == nbrTours){ // Si c'est un brunco, on passe brunco à vrai
                    score += 21;
                    break; // On stop la boucle des essais
                }
                else // Si c'est n'est pas un brunco, mais qu'on possède 3 nombres identiques, on ajoute +5
                    score += 5;
            }
            else{ // Sinon, on vérifie simplement s'il y a des points à ajouer
                resultatSansBrunco(resultat);
            }
        }
        return score;
    }

    // Permet de réaliser un lancé de chaque dés possédé par le joueur
    private int[] lancerLesDes(Joueur leJoueur) {
        int[] resultat = new int[leJoueur.nbrDes()]; // Variable servant à stocké le resultat des lancés
        int index = 0;
        for(Iterator<De> d = leJoueur.getListeDes().iterator(); d.hasNext(); index++){ //On parcours chacun des dés du joueur
            resultat[index] = d.next().LancerDe(); //On lance le dés, puis on stock le résultat du lancé
        }
        return resultat;
    }

    // Méthode vérifiant le nombre de points supplémentaire à ajouter
    public int resultatSansBrunco(int[] lancers){
        int score = 0;
        for(int x : lancers){
            if(x == nbrTours){ //Si le lancé du dés correspond au numéro du tours, on ajoute un point
                score += 1;
            }
        }
        return score;

    }

    public Joueur calculerLeVainqueur() {
        Joueur gagnant = null;
        for(Joueur i : ListeJoueurs){
            if(gagnant == null || i.getScore() > gagnant.getScore()){
                gagnant = i;
            }
        }
        return gagnant;
    }
    public int getNbrTours(){
        return nbrTours;
    }

}