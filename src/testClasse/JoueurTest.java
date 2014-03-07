/******************************************************
Cours:  LOG121
Projet: laboratoire 2
Nom du fichier: JoueurTest.java
Date créé: 2014-02-28

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou, Naim Yahyaoui
 *@date Hiver 2014
 *******************************************************/

package testClasse;

import jeu2D.CollectionDes;
import jeu2D.De;
import jeu2D.Joueur;
import junit.framework.TestCase;

/**
 * Cette classe permet de tester la classe Joueur gr�ce � JUnit
 * 
 * 
 */
public class JoueurTest extends TestCase {

	/**
	 * Test si ce constructeur cr�ait bien un objet de type Joueur avec le nom
	 * qui lui est pass� en param�tre
	 */
	public void testJoueur() {
		Joueur Patrick = new Joueur("Patrick");
		assertTrue(Patrick instanceof Joueur);
		assertEquals(Patrick.getNom(), "Patrick");

	}

	/**
	 * Test si le score ajout� est bien le bon et si l'accesseur du score est
	 * correct
	 */
	public void testAjouterScore() {
		Joueur Patrick = new Joueur("Patrick");
		Patrick.ajouterScore(5);
		assertEquals(Patrick.getScore(), 5);
	}

	/**
	 * Test de la m�thode permettant de savoir le nombre de d�s d'un joueur
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
	 * Ici on test si l'ajout d'un d� fonctionne pour un joueur, si l'accesseur
	 * de la liste de d� d'un joueur fonctionne et si l'accesseur du nombre de
	 * face d'un d� fonctionne aussi
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
	 * Test si la fonction getListeDes renvoie bien un objet de type
	 * CollectionDes
	 */
	public void testGetListeDes() {
		Joueur Patrick = new Joueur("Patrick");
		assertTrue(Patrick.getListeDes() instanceof CollectionDes);
	}

	/**
	 * Test si le score renvoy� est bien le bon
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
	 * Test si la m�thode de comparaison de deux Joueur fonctionne
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
