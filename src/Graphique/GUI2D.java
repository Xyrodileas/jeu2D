package Graphique;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GUI2D extends JFrame{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private PanneauD panneauD;
		private JButton boutonLancerDes;
		private JTable graphiqueScoreTableau;
		private Menu2D menu;
		private TabScore tabScore = new TabScore();
		private PanneauJoueurDe panneauRecap;
		
		//private Brunco jeuBrunco;
		
		
	    public GUI2D() {
	    	
	        setTitle("Jeu 2D BUNCO");
	        this.setLayout(new BorderLayout());
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setPreferredSize(new Dimension(1300,600));
	        this.pack();
	        
	        
	        //jeuBrunco = new Brunco();
	        
	        menu= new Menu2D(this);
	        this.setJMenuBar(menu);
	        
	        
	        panneauD=new PanneauD();
	        add(panneauD,BorderLayout.SOUTH);
	       
	        panneauRecap = new PanneauJoueurDe();
	        add(panneauRecap,BorderLayout.EAST);
	        
	        boutonLancerDes =new JButton("Lancer Des");
	        boutonLancerDes.addActionListener(new LancerDes(this));
	        
	        //TEST
	        JButton boutontest =new JButton("ChangerTour");
	        boutontest.addActionListener(new ActionListener(){
	        	
	    			public void actionPerformed(ActionEvent arg0) {
	    				tabScore.miseAjourDesTours(2, 4, 1000);
	    				graphiqueScoreTableau.repaint();
	    		    }
	    	    });
	        
	        JPanel panneauLancerDes = new JPanel();
	        
	        panneauLancerDes.add(boutonLancerDes);
	        panneauLancerDes.add(boutontest);
	        add(panneauLancerDes,BorderLayout.CENTER);
	       
	        
	        graphiqueScoreTableau = new JTable(tabScore);
	        getContentPane().add(new JScrollPane(graphiqueScoreTableau), BorderLayout.NORTH);
	       
	        pack();
	    }
	
	    
	    
	    
	    public void rafraichirTableauGraphiqueJoueur(){
	    	graphiqueScoreTableau.repaint();
		}
	    
	    
	    public void reinitialiserTout(){
	    	tabScore.reinitialiserTableau();
	    	panneauD.reinitialiserBoutonNull();
	    	panneauRecap.reinitialiserPanneauJoueurDe();
		}
	    
	    public void lancerDes(){
	    	int de1=(int) Math.floor(Math.random()* (6 - 1 + 1) + 1);
	    	int de2=(int) Math.floor(Math.random()* (6 - 1 + 1) + 1);
	    	int de3=(int) Math.floor(Math.random()* (6 - 1 + 1) + 1);
	    	panneauD.lancerDes(de1, de2, de3);
	    	panneauRecap.setValeur3D(de1, de2, de3);
	    	
	    }
	    public void changeNomJoueur(){
	    	//panneauRecap.setNomJoeur("Dupont");
	    	//tabScore.miseADuNomJoueur(2, "Norbert");
	    	graphiqueScoreTableau.repaint();
		}
	    
	    public class LancerDes implements ActionListener{

	    	private PanneauD panneauD;
	    	private GUI2D frame;
	    
	    	
			public LancerDes(GUI2D frameR){
				frame=frameR;
			}
			
			public void actionPerformed(ActionEvent arg0) {
				
				frame.changeNomJoueur();
				frame.lancerDes();
				
			}

		}
	    
	    
	    
	    
	    public static void main(String[] args) {
	        new GUI2D().setVisible(true);
	        
	    }

}
