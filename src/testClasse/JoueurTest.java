package testClasse;

import jeu2D.CollectionDes;
import jeu2D.De;
import jeu2D.Joueur;
import junit.framework.TestCase;

/**
 * Cette classe permet de tester la classe Joueur grâce à JUnit
 * 
 * @author David
 * 
 */
public class JoueurTest extends TestCase {

	/**
	 * Test si ce constructeur créait bien un objet de type Joueur avec le nom
	 * qui lui est passé en paramètre
	 */
	public void testJoueur() {
		Joueur Patrick = new Joueur("Patrick");
		assertTrue(Patrick instanceof Joueur);
		assertEquals(Patrick.getNom(), "Patrick");

	}

	/**
	 * Test si le score ajouté est bien le bon et si l'accesseur du score est correct
	 */
	public void testAjouterScore() {
		Joueur Patrick = new Joueur("Patrick");
		Patrick.ajouterScore(5);
		assertEquals(Patrick.getScore(), 5);
	}

	/**
	 * Test de la méthode permettant de savoir le nombre de dés d'un joueur
	 * fonctionne
	 */
	public void testNbrDes() {
		Joueur Patrick = new Joueur("Patrick");
		Patrick.ajouterDe(6);
		Patrick.ajouterDe(6);
		Patrick.ajouterDe(6);
		assertEquals(Patrick.getNbrDes(), 3);
	}

	/**
	 * Ici on test si l'ajout d'un dé fonctionne pour un joueur, si l'accesseur
	 * de la liste de dé d'un joueur fonctionne et si l'accesseur du nombre de
	 * face d'un dé fonctionne aussi
	 */
	public void testAjouterDe() {
		Joueur Patrick = new Joueur("Patrick");
		Patrick.ajouterDe(6);
		assertTrue(Patrick.getListeDes().ListeDe.get(0) instanceof De);
		assertEquals(((De) Patrick.getListeDes().ListeDe.get(0)).getNbrFace(),
				6);
		Patrick.ajouterDe(2);
		assertEquals(((De) Patrick.getListeDes().ListeDe.get(1)).getNbrFace(),
				2);
	}

	/**
	 * Test si la fonction getListeDes renvoie bien un objet de type CollectionDes
	 */
	public void testGetListeDes() {
		Joueur Patrick = new Joueur("Patrick");
		assertTrue(Patrick.getListeDes() instanceof CollectionDes);
	}

	/**
	 * Test si le score renvoyé est bien le bon
	 */
	public void testGetScore() {
		Joueur Patrick = new Joueur("Patrick");
		Patrick.ajouterScore(2);
		assertEquals(Patrick.getScore(), 2);
	}

	/**
	 * Test de la fonction de reset du score
	 */
	public void testResetScore() {
		Joueur Patrick = new Joueur("Patrick");
		Patrick.ajouterScore(2);
		Patrick.resetScore();
		assertEquals(Patrick.getScore(), 0);
	}

	/**
	 * Test si la méthode de comparaison de deux Joueur fonctionne
	 */
	public void testCompareTo() {
		Joueur David = new Joueur("David");
		David.ajouterScore(3);
		Joueur David2 = new Joueur("David");
		David2.ajouterScore(3);
		assertEquals(David.compareTo(David2), 1);
		Joueur Jean = new Joueur("Jean");
		assertEquals(Jean.compareTo(David), 0);
	}

}
