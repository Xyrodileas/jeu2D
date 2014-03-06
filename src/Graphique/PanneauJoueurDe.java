package Graphique;


import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanneauJoueurDe extends JPanel{



	//ATTRIBUTS
	private  JLabel nomDuJoueur;
	private  JLabel points;
	
	private  JLabel de1;
	private  JLabel de2;
	private  JLabel de3;
	
	public PanneauJoueurDe(){
		
		//this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	
		initComposants();			
	}
	
	
	private void initComposants(){

		nomDuJoueur = new JLabel(" Joueur :  ");
		points = new 	JLabel(" Points =");
		
		de1 = new JLabel(" DE 1 = ");
		de2= new JLabel(" DE 2 = ");
		de3= new JLabel(" DE 3 = ");
		
		
		add(nomDuJoueur);
		add(points);
		add(de1);
		add(de2);
		add(de3);
	}
	
	public void setValeur3D(int de1R, int de2R, int de3R){
		de1.setText(" DE 1 = " +String.valueOf(de1R));
		de2.setText(" DE 2 = " +String.valueOf(de2R));
		de3.setText(" DE 3 = " +String.valueOf(de3R));
		validate();
		repaint();
		
	}
	
	public void setNomJoeur(String nomRecu){
		nomDuJoueur.setText("Joueur : "+nomRecu);
	}
	
	public void setPoints(int pointRecu){
		points.setText(" Points ="+String.valueOf(pointRecu));
	}
	
	public void reinitialiserPanneauJoueurDe(){
		
		de1.setText("DE 1 = " );
		de2.setText("DE 2 = " );
		de3.setText("DE 3 = " );
		nomDuJoueur.setText("Joueur : ");
		points.setText(" Points = ");
		validate();
		repaint();
	}

			
			
	
	
}

