package Graphique;


import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanneauJoueurDe extends JPanel{



	//ATTRIBUTS
	private  JLabel nomDuJoueur;


    private  JLabel nomGagnantTour;
	public PanneauJoueurDe(){
		

		initComposants();
	}
	
	
	private void initComposants(){

		JLabel gtour = new JLabel(" Gagnant :  ");
        nomGagnantTour = new JLabel(" ");



		
		
		add(gtour);
        add(nomGagnantTour);
	}

	
	public void setNomJoeurGagnantTour(String nomRecu){
        nomGagnantTour.setText("Joueur : "+nomRecu);
	}


	
	public void reinitialiserPanneauJoueurDe(){
        nomGagnantTour.setText("Joueur : ");
		validate();
		repaint();
	}

			
			
	
	
}

