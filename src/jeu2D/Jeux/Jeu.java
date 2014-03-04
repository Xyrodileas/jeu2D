package jeu2D.Jeux;

import jeu2D.CollectionJoueur;
import jeu2D.Joueur;
import org.omg.CosNaming._BindingIteratorImplBase;

import java.util.Iterator;

public abstract class Jeu{

    protected Integer nbrTours;

    protected CollectionJoueur<Joueur> ListeJoueurs = new CollectionJoueur<Joueur>();

    public Jeu(){
        nbrTours = 0;
    }
    public abstract void AjouterJoueur(String nomJoueur);
    public abstract void calculScoreTours();
    public abstract Joueur calculerLeVainqueur();

    public int getNbrTours(){
        return nbrTours;
    }

    public void setNbrTours(int nbrTours) {
        this.nbrTours = nbrTours;
    }
}