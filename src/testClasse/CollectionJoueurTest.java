package testClasse;

import jeu2D.CollectionJoueur;
import jeu2D.FabriqueJoueur;
import jeu2D.Joueur;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

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
	public void testIterator() { 														//Fixe nbFaces =6
        CollectionJoueur<Joueur> collection= new CollectionJoueur();						//Creation d'une collection
        Joueur j1 = FabriqueJoueur.nouveauJoueur("Agent 007");
        Joueur j2 = FabriqueJoueur.nouveauJoueur("Agent 006");
        Joueur j3 = FabriqueJoueur.nouveauJoueur("Agent 005");
        collection.ajouterJoueur(j1);
        collection.ajouterJoueur(j2);
        collection.ajouterJoueur(j3);

        Iterator<Joueur> iterateur = ((CollectionJoueur)collection).iterator();				//Creation d'un iterateur de CollectionDes
        assertTrue(iterateur instanceof  Iterator);								//Test Instance de Iterateur<De>

        		//Creation d'un nouvel Iterator de la CollectionDe

        Assert.assertTrue(iterateur.hasNext());								//Test Si dispose d'un suivant Oui
        Assert.assertNotNull(iterateur.next());								//Test si le suivant n'est pas null ( dispose d'un de)
        Assert.assertNotNull(iterateur.next());								//Test si le suivant n'est pas null ( dispose d'un de)
        Assert.assertNotNull(iterateur.next());
        Assert.assertFalse(iterateur.hasNext());       						//Test si il a un suivant ( Normalement non car 3 elements dans la collection seulement)

    }

}
