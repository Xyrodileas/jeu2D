package testClasse;

import jeu2D.FabriqueJoueur;
import jeu2D.Jeux.Brunco;
import jeu2D.Jeux.Jeu;
import jeu2D.Joueur;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;

/**
 * Created by Alexis on 26/02/14.
 */
public class BruncoTest extends TestCase {
    Brunco BruncoTest;

    @Before
    public void initBruncoTest(){
        BruncoTest = new Brunco();
    }

    public void testCalculScoreTours() throws Exception {

    }

    public void testResultatSansBrunco() throws Exception {

    }

    public void testCalculerLeVainqueur() throws Exception {
        Jeu Brunco = new Brunco();
        Brunco.AjouterJoueur("John Doe");
        Brunco.AjouterJoueur("Garl Field");
        Joueur jtest = (Joueur) new FabriqueJoueur.nouveauJoueur("John Doe");
        Assert.assertEquals(jtest, Brunco.calculerLeVainqueur());
    }

    public void testAjouterJoueur() throws Exception {

    }

    public void testCalculScoreTours1() throws Exception {

    }

    public void testCalculerLeVainqueur1() throws Exception {

    }

    public void testGetNbrTours() throws Exception {
        Assert.assertTrue(BruncoTest.getNbrTours() == 0);
    }
}
