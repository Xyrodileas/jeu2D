package testClasse;

import jeu2D.FabriqueJoueur;
import jeu2D.Jeux.Brunco;
import jeu2D.Joueur;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;

/**
 * Created by Alexis on 26/02/14.
 */
public class BruncoTest extends TestCase {
    Brunco BruncoTest;

    @Before //TODO Ne marche pas
    public void initialize(){
        BruncoTest = new Brunco();
    }

    public void testCalculScoreTours() throws Exception {

    }

    public void testResultatSansBrunco() throws Exception {
        Brunco BruncoTest = new Brunco();
        BruncoTest.setNbrTours(5);
        int[] lancers = {1,2,3,4,5,6,7,8,9,0};
        Assert.assertEquals(BruncoTest.resultatSansBrunco(lancers), 1);
    }

    public void testCalculerLeVainqueur() throws Exception {
        BruncoTest.AjouterJoueur("John Doe");
        BruncoTest.AjouterJoueur("Garl Field");
        Joueur jtest = FabriqueJoueur.nouveauJoueur("John Doe");
        Assert.assertEquals(jtest, BruncoTest.calculerLeVainqueur());
    }

    public void testAjouterJoueur() throws Exception {

    }

    public void testCalculScoreTours1() throws Exception {

    }

    public void testCalculerLeVainqueur1() throws Exception {

    }

    public void testLancerLesDes(){
        BruncoTest = new Brunco();
        Joueur j1 = FabriqueJoueur.nouveauJoueur("George R. R. Martin");
        for(int x=0; x<4; x++)
            j1.ajouterDe(6);
        int[] resultat = BruncoTest.lancerLesDes(j1); //TODO Le test ne passe pas tant que hasnext() n'est pas finit
        for(int n=0; n<4; n++)
            Assert.assertNotNull(resultat[n]);
    }

    public void testGetNbrTours() throws Exception {
        BruncoTest = new Brunco();
        Assert.assertTrue(BruncoTest.getNbrTours() == 0);
    }
}
