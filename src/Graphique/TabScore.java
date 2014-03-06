package Graphique;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TabScore extends AbstractTableModel {
    private JoueurGraphique[] tabJoueur=new JoueurGraphique [5];
    private ArrayList<JoueurGraphique> listeJoueurs = new ArrayList<JoueurGraphique>();
 
    private final String[] entetes = {"Nom Du Joeur", "Tour1", "Tour2", "Tour3", "Tour4","Tour5","Tour6","Total"};
    
 
    public TabScore() {
    	
    	initialiserTableauDeJoueur();

    }
 
    
    //TEST APRES FAUT FAIRE SELON NB JOUEURS
    public void initialiserTableauDeJoueur(){
    	
    	this.tabJoueur[0]=(new JoueurGraphique("j1",1,2,3,4,5,6));
    	this.tabJoueur[1]=(new JoueurGraphique("j2",1,2,3,4,5,6));
    	this.tabJoueur[2]=(new JoueurGraphique("j3",1,2,3,4,5,6));
    	this.tabJoueur[3]=(new JoueurGraphique("j4",1,2,3,4,5,6));
    	this.tabJoueur[4]=(new JoueurGraphique("j5",1,2,3,4,5,6));
    
    	for(int i=0; i<tabJoueur.length;i++)
    			listeJoueurs.add(tabJoueur[i]);
    }
    
    public void reinitialiserTableau(){
    	tabJoueur=new JoueurGraphique [5];
    	
      	for(int i=0; i<tabJoueur.length;i++)
      
      		listeJoueurs.get(i).remiseAzeroDuJoueur();

    	
    }
    
    public void miseAjourDesTours(int joueur,int tours, int score) {
    	
    	listeJoueurs.get(joueur).setScTour1(score);
 
    }
 public void miseADuNomJoueur(int joueur, String nomR) {
    	
    	listeJoueurs.get(joueur).setNom(nomR);;
 
    }
    
    
    
    
    public int getRowCount() {
        return listeJoueurs.size();
    }
 
    public int getColumnCount() {
        return entetes.length;
    }
 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listeJoueurs.get(rowIndex).getNom();
            case 1:
                return listeJoueurs.get(rowIndex).getScTour1();
            case 2:
                return listeJoueurs.get(rowIndex).getScTour2();
            case 3:
                return listeJoueurs.get(rowIndex).getScTour3();
            case 4:
                return listeJoueurs.get(rowIndex).getScTour4();
            case 5:
                return listeJoueurs.get(rowIndex).getScTour5();
            case 6:
                return listeJoueurs.get(rowIndex).getScTour6();
            default:
                return null;
        }
    }
}