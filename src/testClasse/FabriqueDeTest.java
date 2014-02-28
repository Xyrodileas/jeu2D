package testClasse;

import jeu2D.De;
import jeu2D.FabriqueDe;
import junit.framework.TestCase;


/**
 * JUnit Permet de test
 * la classe FabriqueDe
 * @author i7
 *
 */
public class FabriqueDeTest extends TestCase {

	/**
	 * JUnit test la méthode nouveauDe()
	 * de la classe FabriqueDe
	 */
	public void testNouveauDe() {

		Object un = FabriqueDe.nouveauDe();				//Creation du de
		assertTrue(un instanceof De);					//Verifie si l'instance est bonne
		assertEquals(((De) un).getNbrFace(), 6);		//verifie le nombre de face
		assertEquals(((De) un).getDernierResultat(), 0);//Verifie si le dernier resutat est zero
	}

	
	/**
	 * JUnit test la méthode nouveauDe(int nbrFace)
	 * en construisant un de 
	 * selon un nombre de face souhaite
	 * de la classe FabriqueDe
	 */
	public void testNouveauDeInt() {
		
		Object deux = FabriqueDe.nouveauDe(8);			  //Creation du de
		assertTrue(deux instanceof De);					  //Verifie si l'instance est bonne
		assertEquals(((De) deux).getNbrFace(), 8);		  //verifie le nombre de face= nbrDeFAce souhaite
		assertEquals(((De) deux).getDernierResultat(), 0);//Verifie si le dernier resutat est zero
	}

	
	/**
	 * JUnit test la méthode nouveauDe(int nbrDe ,int nbrFace)
	 * en construisant le nombre de de souhaite dans un tableau de de
	 * selon un nombre de face souhaite
	 * de la classe FabriqueDe
	 */
	public void testNouveauDeIntInt() {
		
		int nbrDe=3;
		int nbrFace=6;
		Object[] tabDe= FabriqueDe.nouveauDe(nbrDe, nbrFace);      //Creation du tableau de des
		
		for(int i=0;i<3;i++){
			assertTrue(tabDe[i] instanceof De);					  //Verifie si l'instance est bonne
			assertEquals(((De)tabDe[i] ).getNbrFace(), nbrFace);  //verifie le nombre de face= nbrDeFace souhaite
			assertEquals(((De) tabDe[i]).getDernierResultat(), 0);//Verifie si le dernier resutat est zero
			
		}
			
		
	}

}
