package testClasse;

import jeu2D.De;
import junit.framework.TestCase;

import java.awt.*;

public class DeTest extends TestCase {

	public void testDe() {
		
		Object d = new De();								//Cration d'un objet de selon le nombre de face par defaut
		assertTrue(d instanceof De);						//Verifie si c'est une instance de De
		assertEquals(((De) d).getNbrFace(), 6);		  		 //verifie le nombre de face = 6
	}

	public void testDeInt() {
		int nbrFace=9;
		Object d2 = new De(nbrFace);							//Cration d'un objet de selon le nombre de face souhaite
		assertTrue(d2 instanceof De);							//Verifie si c'est une instance de De
		assertEquals(((De) d2).getNbrFace(), nbrFace);		   //verifie le nombre de face = nbrFace
	}

	public void testGetNbrFace() {
		int nbrFace=9;
		Object d2 = new De(nbrFace);							//Cration d'un objet de selon le nombre de face souhaite
		assertTrue(d2 instanceof De);							//Verifie si c'est une instance de De
		assertEquals(((De) d2).getNbrFace(), nbrFace);		   //verifie le nombre de face = nbrFace
	}

	public void testGetCouleur() {
		Object d3 = new De();									//Cration d'un objet de selon le nombre de face souhaite
		assertEquals(((De)d3).getCouleur(), Color.red);		   //verifie la couleur par defaut = rouge
	}

	public void testGetDernierResultat() {
		Object d3 = new De();									//Cration d'un objet de selon le nombre de face souhaite
		assertEquals(((De)d3).getDernierResultat(), 0);			//Verifie si le dernier resultat = 0
		((De)d3).LancerDe();									//Lancer le de
		assertTrue(((De)d3).getDernierResultat()!=0 && ((De)d3).getDernierResultat()<7); //Verifie si le dernier resultat est modifie
	}

	public void testSetNbrFace() {
		int nbrFace =8;
		Object d3 = new De();									//Cration d'un objet de selon le nombre de face souhaite
		((De)d3).setNbrFace(nbrFace);							//Modification du Nbface
		assertEquals(((De)d3).getNbrFace(), nbrFace);			//Verifie si le nombre de face devient egal a nbrFace
		}

	public void testSetCouleur() {
		Object d4 = new De();								    	//Cration d'un objet de selon le nombre de face souhaite
		((De)d4).setCouleur(Color.black);							//Modifie la couleur par defaut par noir
		assertEquals(((De)d4).getCouleur(), Color.black);		   //verifie la couleur par defaut = noir
	}

	public void testSetDernierResultat() {
		Object d3 = new De();									//Cration d'un objet de selon le nombre de face souhaite
		((De)d3).setDernierResultat(3);							// On set le dernier resultat a 3
		assertEquals(((De)d3).getDernierResultat(), 3);			//Verifie si le dernier resulat devient egal a 3
	}

	public void testToString() {
		Object d = new De();									//Cration d'un objet de selon le nombre de face souhaite
		((De)d).LancerDe();										//On lance le de une fois
		assertTrue(((De)d).toString()!=null);					//Verifie si la chaine de caractere renvoyer est differente de null
	}

	public void testLancerDe() {
		Object d = new De();															//Cration d'un objet de selon le nombre de face souhaite
		((De)d).LancerDe();																//Lancer le de
		assertTrue(((De)d).getDernierResultat()!=0 && ((De)d).getDernierResultat()<7); //Verifie si le dernier resultat est modifie
	}

	public void testCompareTo() { //TODO Ajouter un test qui retourne -1
		Object d1 = new De();//creation d un de
		Object d2 = new De();//creation d un de
		Object d3 = new De();//creation d un de
		((De)d3).LancerDe(); //Lancement d'un des de pour avoir un different pour valider test
		assertTrue(((De)d1).compareTo(((De)d2))==1);	//Compare si d1 et d2 sont identique normalement oui
		assertTrue(((De)d1).compareTo(((De)d3))==0);	//Compare si d1 et d3 sont identique normalement non
	}

	public void testCompare() {
		Object d1 = new De();//creation d un de
		Object d2 = new De();//creation d un de
		Object d3 = new De();//creation d un de
		assertTrue(((De)d1).compare(((De)d2), ((De)d3))==1);	//Compare si d1 et d2 et d3 sont identique normalement oui
		((De)d3).LancerDe(); //Lancement d'un des de pour avoir un different pour valider test
		assertTrue(((De)d1).compare(((De)d2), ((De)d3))==0);	//Compare si d1 et d2 et d3 sont identique normalement non vu que de 3 est modifie
	}

}
