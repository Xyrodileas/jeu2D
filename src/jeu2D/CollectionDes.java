package jeu2D;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;


/**
 * CollectionDes qui va permettre
 * de stocker les des des joueurs
 *
 */
public class CollectionDes implements Iterable<De> {

	public Vector<De> ListeDe;
	private int nbrDes;

	
	/**
	 * Constructeur : CollectionDes
	 * Permet de créer une collection vide de des
	 * et indique le nombre de des=0
	 */
    public CollectionDes(){
        ListeDe = new Vector<De>() ;
        nbrDes =0;
    }
    
	
	/**
	 * Constructeur : CollectionDes
	 * Permet de créer une collection vide de des
	 * et indique le nombre de des=0
	 */
    public CollectionDes(int nbDe, int nbFaces){
        ListeDe = new Vector<De>() ;
        nbrDes=nbDe;
        for(int i=0;i<nbDe;i++)
        	ListeDe.add(FabriqueDe.nouveauDe(nbDe, nbFaces)[i]); 
    }
    
    
   
    /**
     * Permet d'ajouter un de à la collection
     * selon le nombre de face souhaité
     * @param int face
     */
	public void ajouterDe(int faces) { // TODO Modifier pour prendre en compte le nombre de faces
		ListeDe.add(FabriqueDe.nouveauDe(faces));
		nbrDes++;
	}

	
	/**
	 * Permet de retourner
	 * le nombre de des de la collection
	 * @return int nombre de des
	 */
	public int getNbrDes() {
		return nbrDes;
	}
	


	/**
	 * Permet d'instancier un itérateur
	 * sur la Collection de De
	 */
	@Override
	public Iterator<De> iterator() {
		return new Iterator<De>() {

			private int positionCourante = 0;

			/**
			 * Permet de retourner le De suivant dans
			 * le vecteur de De (Collection)
			 * 
			 * Consequent :
			 * 			si il n'y a pas de suivant il leve une exception qui directement gerer
			 * 			en retournant un boolean false sinon si suivant existe alors retourne vrai
			 */
			public boolean hasNext()   {
				try{
					// dispose d'un suivant ou dans renvoie vrai
					if (ListeDe.elementAt(positionCourante + 1) != null)
						 return true;
				}
				//Permet de gerer l'exception et renvoie null si pas de suivant
			catch (ArrayIndexOutOfBoundsException e) {return false;}
				return false;
		}
			
			
			/**
			 * Permet de retourner le De precedent dans
			 * le vecteur de De (Collection)
			 * 
			 * Consequent :
			 * 			si il n'y a pas de suivant il leve une exception qui directement gerer
			 * 			en retournant un boolean false sinon si precedent existe alors retourne vrai
			 */
			public boolean hasPrevious()   {
				try{
					// dispose d'un suivant ou dans renvoie vrai
					if (ListeDe.elementAt(positionCourante - 1) != null)
						 return true;
				}
				//Permet de gerer l'exception et renvoie null si pas de suivant
			catch (ArrayIndexOutOfBoundsException e) {return false;}
				return false;
		}
		

			/**
			 * Permet de se positionner
			 *  la position courante
			 *  et de renvoyer l element ( le De)
			 */
			public De next() {
				positionCourante++;
				return ListeDe.elementAt(positionCourante);
			}
			
			/**
			 * Permet de se positionner
			 * avant la position courante
			 *  et de renvoyer l element ( le De)
			 */
			public De previous() {
				positionCourante--;
				return ListeDe.elementAt(positionCourante);
			}
			
			
			
			/**
			 * Methode qui permet de recupere l'element courant
			 * dans le vecteur
			 * @return De
			 */
			public De getElementCourant() {
				return ListeDe.elementAt(positionCourante);
			}

			
			
			/**
			 * Methode qui permet de supprimer
			 * l'element à la position courante
			 */
			public void remove() {
				ListeDe.remove(positionCourante);
			}
		};
	}
}