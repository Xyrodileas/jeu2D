package Graphique;

import jeu2D.De;
import jeu2D.Jeux.FabriqueJeu;
import jeu2D.Jeux.Jeu;
import jeu2D.Joueur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2D extends JFrame{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private PanneauD panneauD;
		private JButton boutonLancerDes;
		private JTable graphiqueScoreTableau;
		private Menu2D menu;
		private TabScore tabScore;
		private PanneauJoueurDe panneauRecap;
		private Joueur gagnant;
		public Jeu jeu;



    public GUI2D() {
	    	
	        setTitle("Jeu 2D BUNCO");
	        this.setLayout(new BorderLayout());
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setPreferredSize(new Dimension(1300,600));
	        this.pack();
            tabScore = new TabScore();


            jeu = FabriqueJeu.NouveauJeu();
            jeu.AjouterJoueur("Idriss");
            jeu.AjouterJoueur("Alexis");
            jeu.AjouterJoueur("David");

            for(Joueur i : jeu.getJoueurs())
	            tabScore.ajouterJoueur(i);

	        menu= new Menu2D(this);
	        this.setJMenuBar(menu);
	        
	        
	        panneauD=new PanneauD(3);
	        add(panneauD,BorderLayout.SOUTH);
	       
	        panneauRecap = new PanneauJoueurDe();
	        add(panneauRecap,BorderLayout.EAST);
	        
	        boutonLancerDes =new JButton("Lancer Des");
	        boutonLancerDes.addActionListener(new LancerDes(this));

	        
	        JPanel panneauLancerDes = new JPanel();
	        
	        panneauLancerDes.add(boutonLancerDes);
	        add(panneauLancerDes,BorderLayout.CENTER);
	       
	        
	        graphiqueScoreTableau = new JTable(tabScore);
	        getContentPane().add(new JScrollPane(graphiqueScoreTableau), BorderLayout.NORTH);
	       
	        pack();
	    }
	
	    
	    
	    
	    public void rafraichirTableauGraphiqueJoueur(){
	    	graphiqueScoreTableau.repaint();
		}
	    
	    
	    public void reinitialiserTout(){
            jeu.resetBrunco();
	    	tabScore.reinitialiserTableau();

	    	panneauD.reinitialiserBoutonNull();
	    	panneauRecap.reinitialiserPanneauJoueurDe();
            boutonLancerDes.setEnabled(true);
		}

	    
	    public void lancerDes(){
	    	gagnant = jeu.calculScoreTours();
            panneauRecap.setNomJoeurGagnantTour(gagnant.getNom());
            int[] resultat = new int[3];
            int index = 0;
            int idjoueur = 0;
            for(Joueur j : jeu.getJoueurs()){

                for(De i : j.getListeDes()){
                    resultat[index] = i.getDernierResultat();
                    index++;

                }
                index = 0;
                panneauD.lancerDes(idjoueur, resultat[0], resultat[1], resultat[2]);
                idjoueur++;
            }
            if(jeu.getNbrTours() >=6){
                boutonLancerDes.setEnabled(false);
            }



            index = 0;
	    	for(Joueur i : jeu.getJoueurs()){
                if(jeu.getNbrTours() == 0)
                    tabScore.listeJoueurs.get(index).setScTour(jeu.getNbrTours(), i.getScore());
                else
                tabScore.listeJoueurs.get(index).setScTour(jeu.getNbrTours(), i.getScore()-tabScore.listeJoueurs.get(index).getTotal());

                tabScore.listeJoueurs.get(index).setTotal(i.getScore());
                index++;
            }
            graphiqueScoreTableau.repaint();
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
