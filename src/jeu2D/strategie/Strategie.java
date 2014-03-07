package jeu2D.strategie;
import jeu2D.CollectionJoueur;
import jeu2D.Joueur;
import jeu2D.Jeux.Jeu;

import java.util.Iterator;
//import jeu2D.Jeux.*;


/**
 * Created by Naim on 07/03/14.
 */
public class Strategie implements IStrategie {

    /**
     * Algorithme pour selectionner le gagnant
     * @param jeu
     */
    public void calculerLeVainqueur(Jeu jeu){

        CollectionJoueur<Joueur> listeDesJoueurs = jeu.getListeJoueurs();

        Iterator<Joueur> ite = listeDesJoueurs.iterator();

        Joueur joueurGagnant, joueurTmp;

        while(ite.hasNext()){
            joueurTmp = ite.next();
        }

    }

    /**
     * Algorithme pour calculer le score
     * @param jeu
     */
    public void calculerScore(Jeu jeu){

    }

}
