package jeu2D;

import java.awt.Color;
import java.util.Comparator;

/**
 * Classe De
 * permet de creer les des
 *
 */
public class De implements Comparable, Comparator{

	
	//CONSTANTE
	  private final int NB_FACE_TRADI=6;
	  
	// LES ATTRIBUTS DE DE
	  private int nbrFace;
	  private  Color couleur=Color.red;
	  private int dernierResultat;

	  //LES CONSTRUCTEURS
	  
	  /**
	   * Constructeur : De
	   * Constructeur par d�faut Vide
	   */
	  public De() {
		  nbrFace=NB_FACE_TRADI;

	  }
	  /**
	   * Constructeur : De
	   * Constructeur par copie d'attributs
	   * Recois une (int) en param�tre
	   * permettant de cr�er le nombre de face 
	   * souhaiter du d�
	   * @param nbrFace
	   */
	  public De(int nbrFace){
	      this.nbrFace = nbrFace;
	  }
	        

	  //LES ACCESSEURS
	  /**
	   * Permet de retourner le nombre
	   * de face
	   */
	  public int getNbrFace() {
		return nbrFace;
	    }
	  
	  /**
	   * Permet de retourner
	   * la couleur
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
	   * @param nbrFaceRecu (int)
	   */
	  public void setNbrFace(int nbrFaceRecu) {
		this.nbrFace = nbrFaceRecu;
		}
	    
	  
	  /**
	   * Methode qui permet de mofifier
	   * la couleur du de si le jeu n�c�ssite des
	   * couleurs de de
	   * @param couleurRecu (Color)
	   */
	  public void setCouleur(Color couleurRecu) {
		this.couleur = couleurRecu;
	    }

	  /**
	   * Methode qui permet d'affecter une valeur
	   * � l'attribut du dernier r�sultat du de
	   * @param dernierResultatRecu (int)
	   */
	  public void setDernierResultat(int dernierResultatRecu) {
		this.dernierResultat = dernierResultatRecu;
	  }
	  
	  
	  	/**
	  	 * Methode qui permet de 
	  	 * retourner une chaine de caratere
	  	 * comprenant toutes les caract�ristique 
	  	 * du de
	  	 * @return (String)
	  	 */
	  	public String toString() {
	  		return "De [nombre de face=" + nbrFace + ", la couleur est =" + couleur
				+ ", Le dernier r�sultat fut  : " + dernierResultat + "]";
	  	}
	  	
	  	
		/**
	  	 * Methde qui permet 
	  	 * de simuler le lancer de de
	  	 * et de retourner la face du de 
	  	 * sur lequelle celui-ci sera tomber.
	  	 * Utilisation de Math.random
	  	 * Pour l'al�atoire
	  	 * @return faceDuDeTomber (int)
	  	 */
		public int LancerDe() {
	    	return this.dernierResultat = (int) (Math.random()* (this.nbrFace - 1 + 1)+1);
	  }
	    
		
		
		
		//Comparateurs
	    
		/**
		 * Methode qui permet de 
		 * comparer deux de gr�ce � 
		 * l'interface Comparable
		 * 1== valeur du Dernier lancer identique  (valeur du de face)
		 * 0== valeur du Dernier lancer differente (valeur du de face)
		 * @return comparateur(int)
		 */
	    public int compareTo(Object o) {

            if(o instanceof Integer){
                if(this.dernierResultat == (Integer)o){
                    return 1;
                }
                return 0;
            }
            else if (o instanceof De){
	    	//On est obliger de caster l'element recu en (De) pour comparer
	    	De objetRecuTmp= (De)o;
	   
		       //On compare retourne un si les deux face sont identique
		       if(this.getDernierResultat() == objetRecuTmp.getDernierResultat())
		    	   return 1;
	    	
	       	//Sinon on retourne le r�sultat 0 = non identique.
	    	return 0;
	        }
            else
                return -1;
        }



	    
	    
	    /**
	     * methode qui permet de comparer
	     * 3 des � la fois
	     * si les 3 faces sont identique alors == 1
	     * sinon les 3 faces sont diff�rente alors == 0
	     * @return comparaison (int)
	     */
	    public int compare(Object arg0, Object arg1) {
	    	De objetRecuTmp1= (De)arg0;
	    	De objetRecuTmp2= (De)arg1;
	    	
	    	if(this.dernierResultat==objetRecuTmp1.getDernierResultat() && this.dernierResultat==objetRecuTmp2.getDernierResultat())
	    		return 1;
	    	
			return 0;
		}

	    
	}