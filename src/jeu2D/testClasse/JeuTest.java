package jeu2D.testClasse;

import jeu2D.Jeux.*;
import jeu2D.Joueur;
import junit.framework.TestCase;
/**
 * Created by Alexis on 26/02/14.
 */
public class JeuTest extends TestCase {
    public void testAjouterJoueur() throws Exception {

    }

    public void testCalculScoreTours() throws Exception {

    }

    public void testResultatSansBrunco() throws Exception {

    }

    public void testCalculerLeVainqueur() throws Exception {
        Jeu Brunco = new Jeu();
        Brunco.AjouterJoueur("John Doe");
        Brunco.AjouterJoueur("Garl Field");
        Joueur jtest;
       // jtest = (Joueur) new FabriqueJoueur.nouveauJoueur("John Doe");
       // Assert.assertEquals(jtest, Brunco.calculerLeVainqueur());
    }
}
