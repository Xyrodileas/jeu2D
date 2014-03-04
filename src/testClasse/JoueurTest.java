package testClasse;

import jeu2D.CollectionDes;
import jeu2D.De;
import jeu2D.Joueur;
import junit.framework.TestCase;


public class JoueurTest extends TestCase {
	Joueur JoueurNul;



	public void testJoueur() {
		Joueur Patrick = new Joueur("Patrick");
		assertTrue(Patrick instanceof Joueur);
		assertEquals(Patrick.getNom(), "Patrick");

	}

	public void testAjouterScore() {
		Joueur Patrick = new Joueur("Patrick");
		Patrick.ajouterScore(5);
		assertEquals(Patrick.getScore(), 5);
	}

	public void testNbrDes() {
		Joueur Patrick = new Joueur("Patrick");
		Patrick.ajouterDe(6);
		Patrick.ajouterDe(6);
		Patrick.ajouterDe(6);
		assertEquals(Patrick.getNbrDes(), 3);
	}

	public void testAjouterDe() {
		Joueur Patrick = new Joueur("Patrick");
		Patrick.ajouterDe(6);
		assertTrue(Patrick.getListeDes().ListeDe.get(0) instanceof De);
		assertEquals(((De) Patrick.getListeDes().ListeDe.get(0)).getNbrFace(), 6);
		Patrick.ajouterDe(2);
		assertEquals(((De) Patrick.getListeDes().ListeDe.get(1)).getNbrFace(), 2);
	}

	public void testGetListeDes() {
		Joueur Patrick = new Joueur("Patrick");
		assertTrue(Patrick.getListeDes() instanceof CollectionDes);
	}

	public void testGetScore() {
		Joueur Patrick = new Joueur("Patrick");
		Patrick.ajouterScore(2);
		assertEquals(Patrick.getScore(), 2);
	}

	public void testResetScore() {
		Joueur Patrick = new Joueur("Patrick");
		Patrick.ajouterScore(2);
		Patrick.resetScore();
		assertEquals(Patrick.getScore(), 0);
	}

	public void testCompareTo() {
		Joueur David = new Joueur("David");
		David.ajouterScore(3);
		Joueur David2 = new Joueur("David");
		David2.ajouterScore(3);
		assertEquals(David.compareTo(David2),1);
		Joueur Jean = new Joueur("Jean");
		assertEquals(Jean.compareTo(David),0);
	}

}
