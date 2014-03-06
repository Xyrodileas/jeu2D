package testClasse;

import jeu2D.CollectionJoueur;
import jeu2D.De;
import jeu2D.FabriqueJoueur;
import jeu2D.Jeux.Bunco;
import jeu2D.Joueur;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Created by Alexis on 26/02/14.
 */
public class BuncoTest extends TestCase {
    Bunco buncoTest;


    public void testResultatSansBrunco() throws Exception {
        buncoTest = new Bunco();
        buncoTest.setNbrTours(5); // On définie le numéro de tours à 5
        De[] LancersDe = new De[3];
        for(int x=0; x < 3; x++){
            LancersDe[x] = new De(6); 
            LancersDe[x].LancerDe();
        }
        
        Assert.assertTrue(buncoTest.resultatSansBrunco(LancersDe) == 0 || buncoTest.resultatSansBrunco(LancersDe)==1 || buncoTest.resultatSansBrunco(LancersDe)==2); // On test si le score correspondant au lancé de dés correspond bien à 1
    }

    public void testCalculerLeVainqueur() throws Exception {
        buncoTest = new Bunco();
        buncoTest.AjouterJoueur("John Doe");
        buncoTest.AjouterJoueur("Garl Field");
        Joueur jtest = FabriqueJoueur.nouveauJoueur("John Doe");
        Assert.assertEquals(1, jtest.compareTo((Joueur) buncoTest.calculerLeVainqueur()));
    }

    public void testAjouterJoueur() throws Exception {
        buncoTest = new Bunco();
        buncoTest.AjouterJoueur("Neil Patrick Harris");
        Iterator i = buncoTest.getJoueurs().iterator();
        Assert.assertEquals("Neil Patrick Harris", ((Joueur)i.next()).getNom());


    }

    public void testCalculScoreTours() throws Exception {
        buncoTest = new Bunco();
        buncoTest.AjouterJoueur("Neil Patrick Harris");
        buncoTest.AjouterJoueur("John Doe");
        buncoTest.AjouterJoueur("Garl Field");

        for(Joueur i : (CollectionJoueur<Joueur>) buncoTest.getJoueurs()){
            System.out.println("Ajout de dés pour " + i.getNom());
            i.ajouterDe(6, 3);
        }
        Joueur gagnant = buncoTest.calculScoreTours();
        Assert.assertTrue(gagnant.getNom()=="Neil Patrick Harris" | gagnant.getNom()=="John Doe" | gagnant.getNom()=="Garl Field");
        gagnant = buncoTest.calculScoreTours();
        Assert.assertTrue(gagnant.getNom()=="Neil Patrick Harris" | gagnant.getNom()=="John Doe" | gagnant.getNom()=="Garl Field");
        gagnant = buncoTest.calculScoreTours();
        Assert.assertTrue(gagnant.getNom()=="Neil Patrick Harris" | gagnant.getNom()=="John Doe" | gagnant.getNom()=="Garl Field");

    }


    public void testLancerLesDes(){
        buncoTest = new Bunco();
        Joueur j1 = FabriqueJoueur.nouveauJoueur("George R. R. Martin");
        for(int x=0; x<4; x++)
            j1.ajouterDe(6);
        int[] resultat = buncoTest.lancerLesDes(j1);
        for(int n=0; n<4; n++)
            Assert.assertNotNull(resultat[n]);
    }

    public void testGetNbrTours() throws Exception {
        buncoTest = new Bunco();
        Assert.assertTrue(buncoTest.getNbrTours() == 0);
    }
}
