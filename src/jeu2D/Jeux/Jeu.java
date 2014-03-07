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
 * Classe représentant la stratégie du jeu, la classe implémente l'interface
 * stratégie
 * 
 */

public class Jeu implements IStrategie {

	// Attribut contenant le nombre de tour
	protected Integer nbrTours;

	// Collection contenant la liste des joueurs
	protected CollectionJoueur<Joueur> ListeJoueurs = new CollectionJoueur<Joueur>();

	/**
	 * Constructeur par défaut de Jeu. La variable du nombre de tour est
	 * initialisé à zéro
	 */
	public Jeu() {
		nbrTours = 0;
	}

	/**
	 * Accesseur du nombre de tour
	 * 
	 * @return le nombre de tour
	 */
	public int getNbrTours() {
		return nbrTours;
	}

	/**
	 * Modificateur du nombre de tour
	 */
	public void setNbrTours(int nbrTours) {
		this.nbrTours = nbrTours;
	}

	/**
	 * Accesseur de la collection, liste de joueurs
	 * 
	 * @return la liste de joueurs
	 */
	public CollectionJoueur<Joueur> getJoueurs() {
		return ListeJoueurs;
	}

	/**
	 * Permet d'ajouter un joueur à la liste de Joueur (à la collection)
	 */
	public void AjouterJoueur(String nomJoueur) {
		ListeJoueurs.ajouterJoueur(FabriqueJoueur.nouveauJoueur(nomJoueur));
        ListeJoueurs.getJoueur().ajouterDe(6,3);
	}

	/**
	 * Permet de calculer les scores des différents joueur de la liste
	 * 
	 * @return le gagant
	 */
	public Joueur calculScoreTours() {
		// Incrémentation du nombre de tour
		nbrTours += 1;

		System.out.println("\nTours N°" + nbrTours
				+ "\n----------------------------");
		// On boucle sur la liste de joueurs
		for (Joueur i : ListeJoueurs) {
			System.out.println("\n" + i.getNom() + ": ");
			// Appelle de la méthode ToursBanco
			int score = ToursBrunco(i);
			// On va ensuite ajouter le résultat au score du joueur
			System.out.println("\nScore du Tours : " + score + "\n");
			i.ajouterScore(score);
			System.out.println("*****\nScore du Joueur : " + i.getScore()
					+ "\n*****");
			// On passe au joueur suivant

		}
		// On récupère le joueur gagnant
		Joueur gagnant = calculerLeVainqueur();
		System.out.println("\nGagnant : " + gagnant.getNom());
		return gagnant;
	}

	/**
	 * Méthode permettant de réaliser un tour de jeu pour un joueur
	 * 
	 * @param leJoueur
	 *            On simule le tour sur ce joueur
	 * @return le score du joueur passé en paramètre
	 */
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

			// Création d'un tableau de dés
			De[] tab = new De[3];
			int index = 0;
			// Si on a 3 nombres égales, on va vérifier si c'est un brunco
			for (De d : (CollectionDes<De>) leJoueur.getListeDes()) {
				tab[index] = d;
				index++;
			}
			// Si on a 3 nombres égales, on va vérifier si c'est un brunco
			if (tab[0].compare(tab[1], tab[2]) == 1) {
				// Si c'est un brunco, on ajout 21 points au joueur
				if (tab[0].compareTo(nbrTours) == 1) {

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
					// On ajoute le score au brunco
					score += sansbrunco;
			}
		}
		return score;
	}

	/**
	 * Permet de réaliser un lancé de chaque dés possédé par le joueur
	 * 
	 * @param leJoueur
	 *            qui va lancer les dés
	 * @return le tableau de dés
	 */
	public int[] lancerLesDes(Joueur leJoueur) {

		// Variable servant à stocker le resultat des lancés
		int[] resultat = new int[leJoueur.getNbrDes()];

		int index = 0;
		// On parcours chacun des dés du joueur
		for (De d : (CollectionDes<De>) leJoueur.getListeDes()) {

			// On lance le dés, puis on stock le résultat du lancé
			resultat[index] = d.LancerDe();

			index += 1;
		}
		return resultat;
	}

	/**
	 * Méthode vérifiant le nombre de points supplémentaire à ajouter
	 * 
	 * @param lancers
	 * @return le nouveau score
	 */
	public int resultatSansBrunco(De[] lancers) {
		int score = 0;
		// Si le lancé executé du dé correspond au numéro du tour, on ajoute un
		// point
		for (De x : lancers) {
			if (x.compareTo(nbrTours) == 1) {

				score += 1;
			}
		}
		return score;

	}

	/**
	 * Méthode permettant de calculer le vainqueur
	 * 
	 * @return le vainqueur du tour
	 */
	public Joueur calculerLeVainqueur() {
		Joueur gagnant = null;
		// On boucle sur la liste de joueur en testant leur score
		for (Joueur i : ListeJoueurs) {
			if (gagnant == null || i.getScore() > gagnant.getScore()) {
				gagnant = i;
			}
		}
		return gagnant;
	}

	/**
	 * Permet de mettre à zéro le brunco
	 */
	public void resetBrunco() {
		this.ListeJoueurs.resetScore();
	}

}
