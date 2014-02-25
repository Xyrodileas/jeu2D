package testClasse;

import junit.framework.Assert;
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
        Assert.assertEquals(new FabriqueJoueur.nouveauJoueur("John Doe"), Brunco.calculerLeVainqueur());
    }
}
