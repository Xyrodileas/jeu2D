package jeu2D;

public class FabriqueJoueur {


	public static Joueur nouveauJoueur(String nom) {
		return new Joueur(nom);
	}

}