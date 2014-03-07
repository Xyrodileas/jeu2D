package jeu2D.Jeux;

import jeu2D.Joueur;

public interface IStrategie {

    public void AjouterJoueur(String nomJoueur);
    public Joueur calculScoreTours();
    public Joueur calculerLeVainqueur();

    public int getNbrTours();

    public void setNbrTours(int nbrTours);
}