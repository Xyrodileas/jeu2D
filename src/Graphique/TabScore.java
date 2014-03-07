package Graphique;

import jeu2D.Joueur;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TabScore extends AbstractTableModel {
    public ArrayList<JoueurGraphique> listeJoueurs;
 
    private final String[] entetes = {"Nom Du Joeur", "Tour1", "Tour2", "Tour3", "Tour4","Tour5","Tour6","Total"};
    
 
    public TabScore() {
        listeJoueurs = new ArrayList<JoueurGraphique>();
    }

 
    
    //TEST APRES FAUT FAIRE SELON NB JOUEURS
    public void ajouterJoueur(Joueur j){
    	listeJoueurs.add(new JoueurGraphique(j.getNom()));

    }
    
    public void reinitialiserTableau(){
    	for(int x=0; x<listeJoueurs.size(); x++){
            listeJoueurs.get(x).resetTotal();
            for(int i=0; i<6; i++)
                listeJoueurs.get(x).setScTour(i+1, 0);

        }

    }
    
    public void miseAjourDesTours(int joueur,int tours, int score) {
    	
    	listeJoueurs.get(joueur).setScTour(tours, score);
 
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
 
    public String getColumnName(int col) {
        return entetes[col];
    }
 
    public Object getValueAt(int ligne, int col) {
        if(col == 0){
                return listeJoueurs.get(ligne).getNom();
        }
        else if(col < 7){
                return listeJoueurs.get(ligne).getScTour(col-1);
            }
        else {
            return listeJoueurs.get(ligne).getTotal();

        }

    }
}
