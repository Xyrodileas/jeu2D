/******************************************************
Cours:  LOG121
Projet: laboratoire 2
Nom du fichier: FabriqueJoueurTest.java
Date créé: 2014-02-28

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou, Naim Yahyaoui
 *@date Hiver 2014
 *******************************************************/

package testClasse;

import static org.junit.Assert.*;
import jeu2D.De;
import jeu2D.FabriqueJoueur;
import jeu2D.Joueur;

import org.junit.Test;

/**
 * Classe testant la classe FabriqueJoueur
 */
public class FabriqueJoueurTest {

	@Test
	/**
	 * Ici on test si la m�thode nouveauJoueur renvoie bien un objet de type Joueur avec le nom pass� en param�tre
	 */
	public void testNouveauJoueur() {
		Joueur Patrick = FabriqueJoueur.nouveauJoueur("Patrick");
		assertTrue(Patrick instanceof Joueur);
		assertEquals(Patrick.getNom(), "Patrick");
	}

}
