package jeu2D;

public class De implements Comparable{

  public int nbrFace;

  public De(int nbrFace){
      this.nbrFace = nbrFace;
  }

  public De() {

  }

    public int LancerDe() {
  return 1;
  }

    @Override
    public int compareTo(Object o) { //TODO Implémenter les méthodes de l'interface
        return 0;
    }
}