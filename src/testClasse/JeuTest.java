/******************************************************
Cours:  LOG121
Projet: laboratoire 2
Nom du fichier: JeuTest.java
Date créé: 2014-02-28

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou, Naim Yahyaoui
 *@date Hiver 2014
 *******************************************************/


package testClasse;

import jeu2D.De;
import jeu2D.FabriqueJoueur;
import jeu2D.Jeux.Jeu;
import jeu2D.Joueur;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 */
public class JeuTest extends TestCase {
	Jeu jeuTest;

	public void testResultatSansBrunco() throws Exception {
		jeuTest = new Jeu();
		jeuTest.setNbrTours(5); // On définie le numéro de tours à 5
		De[] LancersDe = new De[3];
		for (int x = 0; x < 3; x++) {
			LancersDe[x] = new De(6);
			LancersDe[x].LancerDe();
		}

		Assert.assertTrue(jeuTest.resultatSansBunco(LancersDe) == 0
				|| jeuTest.resultatSansBunco(LancersDe) == 1
				|| jeuTest.resultatSansBunco(LancersDe) == 2); // On test si le
																// score
																// correspondant
																// au lancé de
																// dés
																// correspond
																// bien à 1
	}

	public void testCalculerLeVainqueur() throws Exception {
		jeuTest = new Jeu();
		jeuTest.AjouterJoueur("John Doe");
		jeuTest.AjouterJoueur("Garl Field");
		Joueur jtest = FabriqueJoueur.nouveauJoueur("John Doe");
		Assert.assertEquals(1,
				jtest.compareTo((Joueur) jeuTest.calculerLeVainqueur()));
	}

	public void testAjouterJoueur() throws Exception {
		jeuTest = new Jeu();
		jeuTest.AjouterJoueur("Neil Patrick Harris");
		Iterator i = jeuTest.getJoueurs().iterator();
		Assert.assertEquals("Neil Patrick Harris", ((Joueur) i.next()).getNom());

	}

	public void testCalculScoreTours() throws Exception {
		jeuTest = new Jeu();
		jeuTest.AjouterJoueur("Neil Patrick Harris");
		jeuTest.AjouterJoueur("John Doe");
		jeuTest.AjouterJoueur("Garl Field");

		Joueur gagnant = jeuTest.calculScoreTours();
		Assert.assertTrue(gagnant.getNom() == "Neil Patrick Harris"
				| gagnant.getNom() == "John Doe"
				| gagnant.getNom() == "Garl Field");
		gagnant = jeuTest.calculScoreTours();
		Assert.assertTrue(gagnant.getNom() == "Neil Patrick Harris"
				| gagnant.getNom() == "John Doe"
				| gagnant.getNom() == "Garl Field");
		gagnant = jeuTest.calculScoreTours();
		Assert.assertTrue(gagnant.getNom() == "Neil Patrick Harris"
				| gagnant.getNom() == "John Doe"
				| gagnant.getNom() == "Garl Field");

	}

	public void testLancerLesDes() {
		jeuTest = new Jeu();
		Joueur j1 = FabriqueJoueur.nouveauJoueur("George R. R. Martin");
		for (int x = 0; x < 4; x++)
			j1.ajouterDe(6);
		int[] resultat = jeuTest.lancerLesDes(j1);
		for (int n = 0; n < 4; n++)
			Assert.assertNotNull(resultat[n]);
	}

	public void testGetNbrTours() throws Exception {
		jeuTest = new Jeu();
		Assert.assertTrue(jeuTest.getNbrTours() == 0);
	}

    public void testresultatBunco(){
        De d1 = new De(6);
        De d2 = new De(6);
        De d3 = new De(6);
        d1.setDernierResultat(1);
        d2.setDernierResultat(1);
        d3.setDernierResultat(1);
        Jeu jeutest = new Jeu();
        De[] tab = new  De[]{d1, d2, d3};
        Assert.assertEquals(21 ,jeutest.resultatBunco(tab, 1));
        d1.setDernierResultat(2);
        d2.setDernierResultat(2);
        d3.setDernierResultat(2);
        Assert.assertEquals(5 ,jeutest.resultatBunco(tab, 1));
        d1.setDernierResultat(1);
        d2.setDernierResultat(2);
        d3.setDernierResultat(3);
        Assert.assertEquals(0 ,jeutest.resultatBunco(tab, 1));
    }
}
