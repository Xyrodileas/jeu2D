package testClasse;

import static org.junit.Assert.*;

import java.util.Iterator;

import jeu2D.CollectionDes;
import jeu2D.CollectionJoueur;
import jeu2D.De;
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
		Joueur[] tabJoueur = { null, null, null };
		Joueur JoueurTest0 = new Joueur("JoueurTest0");
		Joueur JoueurTest1 = new Joueur("JoueurTest1");
		Joueur JoueurTest2 = new Joueur("JoueurTest2");

		CollectionJoueur<Joueur> CollectionTest = new CollectionJoueur<Joueur>();

		assertEquals(CollectionTest.getNbJoueur(), 0);

		CollectionTest.ajouterJoueur(JoueurTest0);
		CollectionTest.ajouterJoueur(JoueurTest1);
		CollectionTest.ajouterJoueur(JoueurTest2);
		tabJoueur[0] = JoueurTest0;
		tabJoueur[1] = JoueurTest1;
		tabJoueur[2] = JoueurTest2;

		Iterator iterateur = ((CollectionJoueur) CollectionTest).iterator(); // Creation
																				// d'un
		assertTrue(iterateur instanceof Iterator);

		for (int i = 0; i < 3; i++) {

			assertEquals(tabJoueur[i].compareTo(iterateur.next()), 1);
		}
	}

}
