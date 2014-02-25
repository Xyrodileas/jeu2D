public class Joueur implements Comparable{

  public String Nom;
  private int score;

  private CollectionDes  ListeDes;

    //TODO Ajouter une méthode reset score
    public Joueur(){
        score = 0;
    }
    public void ajouterScore(int x){
        this.score += x;
    }
    public int nbrDes(){
        return 3; //TODO Implenter le comportement
    }
    public CollectionDes getListeDes(){
        return this.ListeDes;
    }

        @Override //TODO Implémenter méthodes de l'interface
        public int compareTo(Object o) {
            return 0;
        }

}