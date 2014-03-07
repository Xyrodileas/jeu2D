package Graphique;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu2D extends JMenuBar{

	//private Brunco jeuBrunco;
	private GUI2D frame; 
	
	// NE PAS OUBLIER D ENVOYER EN PARAMETRE BRUNCO
	public Menu2D(GUI2D frameR) {
		frame= frameR;
		addMenuJeuBrunco();
	}


	
	private void addMenuJeuBrunco() {
		
		   		JMenu menuJeu = new JMenu(" Jeu ");
		 
		   		JMenuItem demarrer = new JMenuItem("Demarrer");
		   		demarrer.addActionListener(new ActionListener(){
		        	
	    			public void actionPerformed(ActionEvent arg0) {
	    				System.out.println("Lancement du jeu");
	    			

	    				
	    				// AJOUTER REMISE A ZERO BRANCO
	    		    }
	    	    });
		   		JMenuItem reinitialiser = new JMenuItem("Reinitialiser");
		   		
		   		reinitialiser.addActionListener(new ActionListener(){
		        	
		    			public void actionPerformed(ActionEvent arg0) {
		    				System.out.println("REINITIALISER BRUNCO");
		    				frame.reinitialiserTout();
		    				frame.rafraichirTableauGraphiqueJoueur();
		    				
		    				// AJOUTER REMISE A ZERO BRANCO
		    		    }
		    	    });
		   		
		   		menuJeu.add(demarrer);
		   		menuJeu.add(reinitialiser);
			   
		   	  
			   add(menuJeu);
		   
	}
	
}
