package testClasse;

import static org.junit.Assert.*;
import jeu2D.CollectionJoueur;
import jeu2D.Joueur;

import org.junit.Test;

public class CollectionJoueurTest {

	@Test
	public void testCollectionJoueur() {
		CollectionJoueur<Joueur> CollectionTest = new CollectionJoueur<Joueur>();
		assertTrue(CollectionTest instanceof CollectionJoueur);
	}

	@Test
	public void testAjouterJoueur() {
		Joueur JoueurTest = new Joueur("JoueurTest");
		CollectionJoueur<Joueur> CollectionTest = new CollectionJoueur<Joueur>();
		CollectionTest.ajouterJoueur(JoueurTest);
		assertEquals(JoueurTest, CollectionTest.getJoueur());
		assertEquals(CollectionTest.getNbJoueur(), 1);
	}
	
	@Test
	public void testgetNbJoueur() {
		Joueur JoueurTest = new Joueur("JoueurTest");
		CollectionJoueur<Joueur> CollectionTest = new CollectionJoueur<Joueur>();
		assertEquals(CollectionTest.getNbJoueur(), 0);
		CollectionTest.ajouterJoueur(JoueurTest);
		CollectionTest.ajouterJoueur(JoueurTest);
		CollectionTest.ajouterJoueur(JoueurTest);
		CollectionTest.ajouterJoueur(JoueurTest);
		assertEquals(CollectionTest.getNbJoueur(), 4);
		
	}

	@Test
	public void testIterator() {
		fail("Not yet implemented");
	}

}
