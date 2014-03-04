package testClasse;

import jeu2D.CollectionDes;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Iterator;

/**
 * JUnit de Classe CollectionDes
 *  permettant de tester la classe
 *  et l'ensemble des methodes
 *
 */
public class CollectionDesTest extends TestCase  {

	
	/**
	 * Methode qui permet
	 * de tester le constructeur de 
	 * la classe CollectionDes
	 */
	public void testCollectionDes() {
		Object collection= new CollectionDes();										//Creation d'une collection
		assertTrue(collection instanceof CollectionDes);							//Verifie si collection est une instance de CollectionDes
		assertEquals(((CollectionDes)collection).getNbrDes(), 0);					//verifie le nombre de face
		}

	/**
	 * Methode qui permet de tester
	 * le deuxiemme constructeur de la classe
	 * soit CollectionDes(int nbDe, int nbFaces)
	 */
	public void testCollectionDesIntInt() {
		int nbDe=5;																//Fixe nbDe=5
		int nbFaces=8;															//Fixe nbFaces =8
		Object collection= new CollectionDes(nbDe,nbFaces);						//Creation d'une collection
		assertTrue(collection instanceof CollectionDes);						//Verifie si collection est une CollectionDes 
		assertEquals(((CollectionDes)collection).getNbrDes(), nbDe);			//Verifie Si le nombre de des correspond a nbDe=5
	}

	/**
	 * Methode qui permet de tester
	 * la methode ajouter dans la classe
	 * CollectionDes
	 */
	public void testAjouterDe() {
		Object collection= new CollectionDes();									//Creation d'une collection
		assertTrue(collection instanceof CollectionDes);						//Verifie si collection est une CollectionDes 
	    ((CollectionDes)collection).ajouterDe(5);								//On ajoute un DE
		assertEquals(((CollectionDes)collection).getNbrDes(), 1);				//On verifie si le de est bien ajout�
	}

	
	/**
	 * Methode qui permet de tester
	 * la methode getNbrDe pour savoir
	 * si le nombre de de s'incr�mente
	 * convenablement
	 */
	public void testGetNbrDes() {
		int nbDe=5;																//Fixe nbDe=5
		int nbFaces=8;															//Fixe nbFaces =8
		Object collection= new CollectionDes(nbDe,nbFaces);						//Creation d'une collection
		assertEquals(((CollectionDes)collection).getNbrDes(), nbDe);			//Verifie si le nombre de des correspond
	}

	/**
	 * Methode qui permet de tester l'iterateur
	 * de la classe CollectionDes
	 */
	public void testIterator() {
		int nbDe=3;																//Fixe nbDe=3
		int nbFaces=6;															//Fixe nbFaces =6
		Object collection= new CollectionDes(nbDe,nbFaces);						//Creation d'une collection	
		
		Object iterateur = ((CollectionDes)collection).iterator();				//Creation d'un iterateur de CollectionDes
		assertTrue(iterateur instanceof  Iterator);								//Test Instance de Iterateur<De>
		
		Iterator iterateur2 = ((CollectionDes)collection).iterator();			//Creation d'un nouvel Iterator de la CollectionDe
		
		Assert.assertTrue(iterateur2.hasNext());								//Test Si dispose d'un suivant Oui
		Assert.assertNotNull(iterateur2.next());								//Test si le suivant n'est pas null ( dispose d'un de)
		Assert.assertNotNull(iterateur2.next());								//Test si le suivant n'est pas null ( dispose d'un de)
		Assert.assertFalse(iterateur2.hasNext()); 						//Test si il a un suivant ( Normalement non car 3 elements dans la collection seulement)

	}

}
