package testClasse;

import static org.junit.Assert.*;
import jeu2D.De;
import jeu2D.FabriqueJoueur;
import jeu2D.Joueur;

import org.junit.Test;

/**
 * Classe testant la classe FabriqueJoueur
 * 
 * @author David
 * 
 */
public class FabriqueJoueurTest {

	@Test
	/**
	 * Ici on test si la méthode nouveauJoueur renvoie bien un objet de type Joueur avec le nom passé en paramètre
	 */
	public void testNouveauJoueur() {
		Joueur Patrick = FabriqueJoueur.nouveauJoueur("Patrick");
		assertTrue(Patrick instanceof Joueur);
		assertEquals(Patrick.getNom(), "Patrick");
	}

}
