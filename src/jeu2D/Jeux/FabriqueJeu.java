package jeu2D.Jeux;

/**
 * Created by Alexis on 07/03/14.
 */
public abstract class FabriqueJeu {

    public static Jeu NouveauJeu(){
        return new Jeu();
    }
}
