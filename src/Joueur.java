public class Joueur implements Comparable{

  public String Nom;

  private CollectionDes  ListeDes;

    public Joueur(){

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