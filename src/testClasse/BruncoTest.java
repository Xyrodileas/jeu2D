package testClasse;

import jeu2D.CollectionJoueur;
import jeu2D.De;
import jeu2D.FabriqueJoueur;
import jeu2D.Jeux.Brunco;
import jeu2D.Joueur;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Created by Alexis on 26/02/14.
 */
public class BruncoTest extends TestCase {
    Brunco BruncoTest;


    public void testResultatSansBrunco() throws Exception {
        BruncoTest = new Brunco();
        BruncoTest.setNbrTours(5); // On définie le numéro de tours à 5
        De[] LancersDe = new De[3];
        for(int x=0; x < 3; x++){
            LancersDe[x] = new De(6); 
            LancersDe[x].LancerDe();
        }
        
        Assert.assertTrue(BruncoTest.resultatSansBrunco(LancersDe) == 0 || BruncoTest.resultatSansBrunco(LancersDe)==1 || BruncoTest.resultatSansBrunco(LancersDe)==2); // On test si le score correspondant au lancé de dés correspond bien à 1
    }

    public void testCalculerLeVainqueur() throws Exception {
        BruncoTest = new Brunco();
        BruncoTest.AjouterJoueur("John Doe");
        BruncoTest.AjouterJoueur("Garl Field");
        Joueur jtest = FabriqueJoueur.nouveauJoueur("John Doe");
        Assert.assertEquals(1, jtest.compareTo((Joueur) BruncoTest.calculerLeVainqueur()));
    }

    public void testAjouterJoueur() throws Exception {
        BruncoTest = new Brunco();
        BruncoTest.AjouterJoueur("Neil Patrick Harris");
        Iterator i = BruncoTest.getJoueurs().iterator();
        Assert.assertEquals("Neil Patrick Harris", ((Joueur)i.next()).getNom());


    }

    public void testCalculScoreTours() throws Exception {
        BruncoTest = new Brunco();
        BruncoTest.AjouterJoueur("Neil Patrick Harris");
        BruncoTest.AjouterJoueur("John Doe");
        BruncoTest.AjouterJoueur("Garl Field");

        for(Joueur i : (CollectionJoueur<Joueur>) BruncoTest.getJoueurs()){
            System.out.println("Ajout de dés pour " + i.getNom());
            i.ajouterDe(6, 3);
        }
        Joueur gagnant = BruncoTest.calculScoreTours();
        Assert.assertTrue(gagnant.getNom()=="Neil Patrick Harris" | gagnant.getNom()=="John Doe" | gagnant.getNom()=="Garl Field");
        gagnant = BruncoTest.calculScoreTours();
        Assert.assertTrue(gagnant.getNom()=="Neil Patrick Harris" | gagnant.getNom()=="John Doe" | gagnant.getNom()=="Garl Field");
        gagnant = BruncoTest.calculScoreTours();
        Assert.assertTrue(gagnant.getNom()=="Neil Patrick Harris" | gagnant.getNom()=="John Doe" | gagnant.getNom()=="Garl Field");

    }


    public void testLancerLesDes(){
        BruncoTest = new Brunco();
        Joueur j1 = FabriqueJoueur.nouveauJoueur("George R. R. Martin");
        for(int x=0; x<4; x++)
            j1.ajouterDe(6);
        int[] resultat = BruncoTest.lancerLesDes(j1);
        for(int n=0; n<4; n++)
            Assert.assertNotNull(resultat[n]);
    }

    public void testGetNbrTours() throws Exception {
        BruncoTest = new Brunco();
        Assert.assertTrue(BruncoTest.getNbrTours() == 0);
    }
}
