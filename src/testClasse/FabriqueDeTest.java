package testClasse;

import jeu2D.De;
import jeu2D.FabriqueDe;
import junit.framework.Assert;
import junit.framework.TestCase;

public class FabriqueDeTest extends TestCase {

	public void testNouveauDe() {
		Object un = FabriqueDe.nouveauDe();
		assertTrue(un instanceof De);
		assertEquals(((De) un).getNbrFace(), 6);
		assertEquals(((De) un).getDernierResultat(), 0);
	}

	public void testNouveauDeInt() {
		
	}

	public void testNouveauDeIntInt() {
		fail("Not yet implemented");
	}

}
