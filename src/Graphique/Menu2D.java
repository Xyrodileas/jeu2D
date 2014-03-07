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
		
		   		JMenu menuJeu = new JMenu(" IStrategie ");
		 

		   		JMenuItem reinitialiser = new JMenuItem("Reinitialiser");
		   		
		   		reinitialiser.addActionListener(new ActionListener(){
		        	
		    			public void actionPerformed(ActionEvent arg0) {
		    				System.out.println("REINITIALISER BRUNCO");

                            frame.jeu.resetBrunco();

		    				frame.reinitialiserTout();
		    				frame.rafraichirTableauGraphiqueJoueur();
		    				
		    				// AJOUTER REMISE A ZERO BRANCO
		    		    }
		    	    });

		   		menuJeu.add(reinitialiser);
			   
		   	  
			   add(menuJeu);
		   
	}
	
}
