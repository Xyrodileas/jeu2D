package jeu2D;

public class FabriqueJoueur {


  public FabriqueJoueur(){

  }
  public static Joueur nouveauJoueur(String nom) {
    return new Joueur(nom);
  }

}