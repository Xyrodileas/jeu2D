package jeu2D;

public class Joueur implements Comparable{

  public String Nom;
  private int score;

  private CollectionDes  ListeDes;

    //TODO Ajouter une méthode reset score
    public Joueur(String nom){
        this.Nom = nom;
        this.score = 0;
    }
    public void ajouterScore(int x){
        this.score += x;
    }
    public int nbrDes(){
        return 3; //TODO Implenter le comportement
    }

    public void ajouterDe(int nbrFaces){
        //TODO A remplir
    }
    public CollectionDes getListeDes(){
        return this.ListeDes;
    }

    public int getScore(){
        return score;
    }

        @Override //TODO Implémenter méthodes de l'interface
        public int compareTo(Object o) {
            return 0;
        }

}