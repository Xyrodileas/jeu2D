/******************************************************
Cours:  LOG121
Projet: laboratoire 2
Nom du fichier: CollectionJoueurTest.java
Date créé: 2014-02-28

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou, Naim Yahyaoui
 *@date Hiver 2014
 *******************************************************/

package testClasse;

import jeu2D.CollectionJoueur;
import jeu2D.FabriqueJoueur;
import jeu2D.Joueur;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Classe testant les méthodes de la classe CollectionJoueur
 * 
 */
public class CollectionJoueurTest {

	/**
	 * Permet de tester le constructeur de la classe CollectionJoueur en
	 * s'assurant que le constructeur créait bien un objet du type
	 * CollectionJoueur
	 */
	@Test
	public void testCollectionJoueur() {
		CollectionJoueur<Joueur> CollectionTest = new CollectionJoueur<Joueur>();
		assertTrue(CollectionTest instanceof CollectionJoueur);
	}

	/**
	 * Permet de tester la méthode ajouterJoueur.
	 */
	@Test
	public void testAjouterJoueur() {
		// Création d'un joueur
		Joueur JoueurTest = new Joueur("JoueurTest");
		// Création d'une collection de joueur
		CollectionJoueur<Joueur> CollectionTest = new CollectionJoueur<Joueur>();
		// Ajout du joueur dans la collection
		CollectionTest.ajouterJoueur(JoueurTest);
		// Test si les joueur correspondent
		assertEquals(JoueurTest, CollectionTest.getJoueur());
		assertEquals(CollectionTest.getNbJoueur(), 1);
	}

	/**
	 * Test si le nombre de joueur retourn� est correct
	 */
	@Test
	public void testgetNbJoueur() {
		Joueur JoueurTest = new Joueur("JoueurTest");
		CollectionJoueur<Joueur> CollectionTest = new CollectionJoueur<Joueur>();
		assertEquals(CollectionTest.getNbJoueur(), 0);
		CollectionTest.ajouterJoueur(JoueurTest); // On ajoute 4 joueurs
		CollectionTest.ajouterJoueur(JoueurTest);
		CollectionTest.ajouterJoueur(JoueurTest);
		CollectionTest.ajouterJoueur(JoueurTest);
		assertEquals(CollectionTest.getNbJoueur(), 4); // On vérifie que la
														// collection contient
														// bien 4 joueurs

	}

	/**
	 * Test de la fonction de reset de score fonctionne come voulu
	 */
	@Test
	public void testresetScore() {
		Joueur J1 = new Joueur("Bob l'Eponge");
		Joueur J2 = new Joueur("Alexandra");
		Joueur J3 = new Joueur("Cleopatre");
		Joueur J4 = new Joueur("Cesar");

		CollectionJoueur<Joueur> CollectionTest = new CollectionJoueur<Joueur>();
		CollectionTest.ajouterJoueur(J1); // On ajoute des joueurs
		CollectionTest.ajouterJoueur(J2);
		CollectionTest.ajouterJoueur(J3);
		CollectionTest.ajouterJoueur(J4);
		int score = 15;
		for (Joueur i : CollectionTest) { // On parcours la liste des joueurs
			i.ajouterScore(score); // On y ajoute un score
			score += 5;
		}
		CollectionTest.resetScore(); // On reset le score des joueurs
		for (Joueur i : CollectionTest) { // On reparcours les joueurs
			assertEquals(i.getScore(), 0); // On vérifie que le score est bien 0
		}
	}

	/**
	 * Test du bon fonctionnement de l'it�rator
	 */
	@Test
	public void testIterator() { // Fixe nbFaces =6
		CollectionJoueur<Joueur> collection = new CollectionJoueur(); // Creation
																		// d'une
																		// collection
		Joueur j1 = FabriqueJoueur.nouveauJoueur("Agent 007");
		Joueur j2 = FabriqueJoueur.nouveauJoueur("Agent 006");
		Joueur j3 = FabriqueJoueur.nouveauJoueur("Agent 005");
		collection.ajouterJoueur(j1);
		collection.ajouterJoueur(j2);
		collection.ajouterJoueur(j3);

		Iterator<Joueur> iterateur = ((CollectionJoueur) collection).iterator(); // Creation
																					// d'un
																					// iterateur
																					// de
																					// CollectionDes
		assertTrue(iterateur instanceof Iterator); // Test Instance de
													// Iterateur<De>

		// Creation d'un nouvel Iterator de la CollectionDe

		assertTrue(iterateur.hasNext()); // Test Si dispose d'un suivant
											// Oui
		assertNotNull(iterateur.next()); // Test si le suivant n'est pas
											// null ( dispose d'un de)
		assertNotNull(iterateur.next()); // Test si le suivant n'est pas
											// null ( dispose d'un de)
		assertNotNull(iterateur.next());
		assertFalse(iterateur.hasNext()); // Test si il a un suivant (
											// Normalement non car 3
											// elements dans la
											// collection seulement)

	}

}
