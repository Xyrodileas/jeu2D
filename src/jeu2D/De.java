package jeu2D;

import java.awt.Color;
import java.util.Comparator;

public class De implements Comparable, Comparator{

	
	// LES ATTRIBUTS DE DE
	  private int nbrFace;
	  private  Color couleur;
	  private int dernierResultat;

	  
	  //LES CONSTRUCTEURS
	  
	  /**
	   * Constructeur : De
	   * Constructeur par défaut Vide
	   */
	  public De() {

	  }
	  /**
	   * Constructeur : De
	   * Constructeur par copie d'attributs
	   * Recois une (int) en paramètre
	   * permettant de créer le nombre de face 
	   * souhaiter du dé
	   * @param nbrFace
	   */
	  public De(int nbrFace){
	      this.nbrFace = nbrFace;
	  }
	        

	  //LES ACCESSEURS
	  /**
	   * Permet de retourner le nombre
	   * de face du de
	   * @param nbrFace (int)
	   */
	  public int getNbrFace() {
		return nbrFace;
	    }
	  
	  /**
	   * Permet de retourner
	   * la couleur du de
	   * @param nbrFace (int)
	   */
	  public Color getCouleur() {
		return couleur;
	    }
	  public int getDernierResultat() {
			return dernierResultat;
		}
	  
	  //LES MUTATEURS
	  /**
	   * Permet de modifier le nombre
	   * de face du de selon 
	   * le type de jeu souhaite
	   * permet l'adaptation du de selon les jeux
	   * possible
	   * @param nbrFace (int)
	   */
	  public void setNbrFace(int nbrFaceRecu) {
		this.nbrFace = nbrFaceRecu;
		}
	    
	  
	  /**
	   * Methode qui permet de mofifier
	   * la couleur du de si le jeu nécéssite des
	   * couleurs de de
	   * @param couleur (Color)
	   */
	  public void setCouleur(Color couleurRecu) {
		this.couleur = couleurRecu;
	    }

	  /**
	   * Methode qui permet d'affecter une valeur
	   * à l'attribut du dernier résultat du de
	   * @param dernierRésultat (int)
	   */
	  public void setDernierRésultat(int dernierResultatRecu) {
		this.dernierResultat = dernierResultatRecu;
	  }
	  
	  
	  	/**
	  	 * Methode qui permet de 
	  	 * retourner une chaine de caratere
	  	 * comprenant toutes les caractéristique 
	  	 * du de
	  	 * @return (String)
	  	 */
	  	public String toString() {
	  		return "De [nombre de face=" + nbrFace + ", la couleur est =" + couleur
				+ ", Le dernier résultat fut  : " + dernierResultat + "]";
	  	}
	  	
	  	
		/**
	  	 * Methde qui permet 
	  	 * de simuler le lancer de de
	  	 * et de retourner la face du de 
	  	 * sur lequelle celui-ci sera tomber.
	  	 * Utilisation de Math.random
	  	 * Pour l'aléatoire
	  	 * @return faceDuDeTomber (int)
	  	 */
		public int LancerDe() {
	    	return this.dernierResultat = (int) (Math.random()* (this.nbrFace - 1 + 1)+1);
	  }
	    
		
		
		
		//Comparateurs
	    
		/**
		 * Methode qui permet de 
		 * comparer deux de grâce à 
		 * l'interface Comparable
		 * 1== valeur du Dernier lancer identique  (valeur du de face)
		 * 0== valeur du Dernier lancer differente (valeur du de face)
		 * @return comparateur(int)
		 */
	    public int compareTo(Object o) { //TODO ImplÃ©menter les mÃ©thodes de l'interface
	    	
	    	//On est obliger de caster l'element recu en (De) pour comparer
	    	De objetRecuTmp= (De)o;
	   
		       //On compare retourne un si les deux face sont identique
		       if(this.getDernierResultat() == objetRecuTmp.getDernierResultat())
		    	   return 1;
	    	
	       	//Sinon on retourne le résultat 0 = non identique.
	    	return 0;
	    }
	    
	    
	    /**
	     * methode qui permet de comparer
	     * 3 des à la fois
	     * si les 3 faces sont identique alors == 1
	     * sinon les 3 faces sont différente alors == 0
	     * @return comparaison (int)
	     */
	    public int compare(Object arg0, Object arg1) {
	    	De objetRecuTmp1= (De)arg0;
	    	De objetRecuTmp2= (De)arg1;
	    	
	    	if(this.dernierResultat==objetRecuTmp1.getDernierResultat() && this.nbrFace==objetRecuTmp2.getDernierResultat())
	    		return 1;
	    	
			return 0;
		}

	    
	}