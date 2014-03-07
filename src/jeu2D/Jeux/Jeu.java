/******************************************************
Cours:  LOG121
Projet: laboratoire 2
Nom du fichier: Jeu.java
Date créé: 2014-02-28

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou, Naim Yahyaoui
 *@date Hiver 2014
 *******************************************************/

package jeu2D.Jeux;

import jeu2D.*;

/**

 */
public class Jeu implements IStrategie {

	protected Integer nbrTours;

	protected CollectionJoueur<Joueur> ListeJoueurs = new CollectionJoueur<Joueur>();

	public Jeu() {
		nbrTours = 0;
	}

	public void AjouterJoueur(String nomJoueur) {
		ListeJoueurs.ajouterJoueur(FabriqueJoueur.nouveauJoueur(nomJoueur));

	}

	public CollectionJoueur<Joueur> getJoueurs() {
		return ListeJoueurs;
	}

	public Joueur calculScoreTours() {
		nbrTours += 1;
		System.out.println("\nTours N°" + nbrTours
				+ "\n----------------------------");
		for (Joueur i : ListeJoueurs) {
			System.out.println("\n" + i.getNom() + ": ");
			int score = ToursBrunco(i);
			// On va ensuite ajouter le résultat au score du joueur
			System.out.println("\nScore du Tours : " + score + "\n");
			i.ajouterScore(score);
			System.out.println("*****\nScore du Joueur : " + i.getScore()
					+ "\n*****");
			// On passe au joueur suivant

		}
		Joueur gagnant = calculerLeVainqueur();
		System.out.println("\nGagnant : " + gagnant.getNom());
		return gagnant;
	}

	// Méthode permettant de réaliser un tour de jeu pour un joueur
	public int ToursBrunco(Joueur leJoueur) {
		int[] resultat;
		int score = 0; // Va contenir le score pour le tours du joueur
		for (int essai = 0; essai < 3; essai++) {
			// On lance chaques dés
			resultat = lancerLesDes(leJoueur);
			System.out.println("\nEssai " + (essai + 1) + " : ");
			for (int x = 0; x < resultat.length; x++)
				System.out.print(resultat[x] + " - ");
			// On vérifier les résultats

			De[] tab = new De[3];
			int index = 0;
			// Si on a 3 nombres égales, on va vérifier si c'est un brunco
			for (De d : (CollectionDes<De>) leJoueur.getListeDes()) {
				tab[index] = d;
				index++;
			}
			// Si on a 3 nombres égales, on va vérifier si c'est un brunco
			if (tab[0].compare(tab[1], tab[2]) == 1) {
				if (tab[0].compareTo(nbrTours) == 1) { // Si c'est un brunco, on
														// passe brunco à vrai
					score += 21;
					break; // On stop la boucle des essais
				} else
					// Si c'est n'est pas un brunco, mais qu'on possède 3
					// nombres identiques, on ajoute +5
					score += 5;
			} else { // Sinon, on vérifie simplement s'il y a des points à
						// ajouer
				int sansbrunco = resultatSansBrunco(tab);
				if (sansbrunco == 0) {
					break;
				} else
					score += sansbrunco;
			}
		}
		return score;
	}

	// Permet de réaliser un lancé de chaque dés possédé par le joueur
	public int[] lancerLesDes(Joueur leJoueur) { // TODO Mettre cette méthode
													// dans joueur
		int[] resultat = new int[leJoueur.getNbrDes()]; // Variable servant à
														// stocké le resultat
														// des lancés
		int index = 0;
		for (De d : (CollectionDes<De>) leJoueur.getListeDes()) { // On parcours
																	// chacun
																	// des dés
																	// du joueur
			resultat[index] = d.LancerDe(); // On lance le dés, puis on stock le
											// résultat du lancé
			index += 1;
		}
		return resultat;
	}

	// Méthode vérifiant le nombre de points supplémentaire à ajouter
	public int resultatSansBrunco(De[] lancers) {
		int score = 0;
		for (De x : lancers) {
			if (x.compareTo(nbrTours) == 1) { // Si le lanc&eacute; du
												// d&eacute;s correspond au
												// num&eacute;ro du tours, on
												// ajoute un point
				score += 1;
			}
		}
		return score;

	}

	public int getNbrTours() {
		return nbrTours;
	}

	public void setNbrTours(int nbrTours) {
		this.nbrTours = nbrTours;
	}

	public Joueur calculerLeVainqueur() {
		Joueur gagnant = null;
		for (Joueur i : ListeJoueurs) {
			if (gagnant == null || i.getScore() > gagnant.getScore()) {
				gagnant = i;
			}
		}
		return gagnant;
	}

	public void resetBrunco() {
		this.ListeJoueurs.resetScore();
	}

}
