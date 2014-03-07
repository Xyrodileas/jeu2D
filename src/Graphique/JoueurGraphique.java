package Graphique;

public class JoueurGraphique {
	    private String nom;
	    
	    private int scTour[];
        private int total;
	 
	    public JoueurGraphique(String nomRecu) {
	        super();
	        total = 0;
	        this.nom = nomRecu;
	        scTour = new int[7];
	    }
	 
	    public int getScTour(int x) {
			return scTour[x];
		}

		public void setScTour(int x, int scTour) {
			this.scTour[x-1] = scTour;
		}

		public String getNom() {
	        return nom;
	    }
	 
	    public void setNom(String nom) {
	        this.nom = nom;
	    }
	    public void remiseAzeroDuJoueur(){
	        	scTour = new int[6];
                total = 0;
	    }

        public void setTotal(int x){
            total = x;
        }
        public void resetTotal(){
            total = 0;
        }
        public int getTotal(){
            return total;
        }
	 

	
}
