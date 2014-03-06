package Graphique;

import java.awt.Color;


public class JoueurGraphique {
	    private String nom;
	    private int scTour1;
	    private int scTour2;
	    private int scTour3;
	    private int scTour4;
	    private int scTour5;
	    private int scTour6;
	 
	    public JoueurGraphique(String nomRecu,int scTour1R,int scTour2R,int scTour3R,int scTour4R,int scTour5R,int scTour6R) {
	        super();
	 
	        this.nom = nomRecu;
	        scTour1=scTour1R;
		    scTour2=scTour2R;
		    scTour3=scTour3R;
		    scTour4=scTour4R;
		    scTour5=scTour5R;
		    scTour6=scTour6R;
	    }
	 
	    public int getScTour1() {
			return scTour1;
		}

		public void setScTour1(int scTour1) {
			this.scTour1 = scTour1;
		}

		public int getScTour2() {
			return scTour2;
		}

		public void setScTour2(int scTour2) {
			this.scTour2 = scTour2;
		}

		public int getScTour3() {
			return scTour3;
		}

		public void setScTour3(int scTour3) {
			this.scTour3 = scTour3;
		}

		public int getScTour4() {
			return scTour4;
		}

		public void setScTour4(int scTour4) {
			this.scTour4 = scTour4;
		}

		public int getScTour5() {
			return scTour5;
		}

		public void setScTour5(int scTour5) {
			this.scTour5 = scTour5;
		}

		public int getScTour6() {
			return scTour6;
		}

		public void setScTour6(int scTour6) {
			this.scTour6 = scTour6;
		}

		public String getNom() {
	        return nom;
	    }
	 
	    public void setNom(String nom) {
	        this.nom = nom;
	    }
	    public void remiseAzeroDuJoueur(){
	        	scTour1=0;
			    scTour2=0;
			    scTour3=0;
			    scTour4=0;
			    scTour5=0;
			    scTour6=0;
	    }
	 

	
}
