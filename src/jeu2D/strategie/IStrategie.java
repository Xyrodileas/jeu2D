package jeu2D.strategie;
import jeu2D.Jeux.Jeu;

/**
 * Created by Naim on 07/03/14
 * Interface de la strategie
 *
 */
public interface IStrategie {

    public void calculerLeVainqueur(Jeu jeu);
    public void calculerScore(Jeu jeu);
}
