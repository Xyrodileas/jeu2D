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

	public Collection<De> ListeDe;
	private int nbrDes;
	private Iterator<De> iterateurDeLaCollection;

	
	/**
	 * Constructeur : CollectionDes
	 * Permet de créer une collection vide de des
	 * et indique le nombre de des=0
	 */
    public CollectionDes(){
        ListeDe = new ArrayList<De>() ;
        nbrDes =0;
        iterateurDeLaCollection=ListeDe.iterator();
    }
    
	
	/**
	 * Constructeur : CollectionDes
	 * Permet de créer une collection vide de des
	 * et indique le nombre de des=0
	 */
    public CollectionDes(int nbDe, int nbFaces){
        ListeDe = new ArrayList<De>() ;
        nbrDes=nbDe;
        iterateurDeLaCollection=ListeDe.iterator();
        for(int i=0;i<nbDe;i++)
        	ListeDe.add(FabriqueDe.nouveauDe(nbDe, nbFaces)[i]); 
        	//SI on veux que L'iterateur suive la position de la collection il faut alors décommenter
        	// iterateurDeLaCollection.next();
    }

    
    /**
     * Permet d'ajouter un de à la collection
     * selon le nombre de face souhaité
     * @param int face
     */
	public void ajouterDe(int faces) { // TODO Modifier pour prendre en compte le nombre de faces
		ListeDe.add(FabriqueDe.nouveauDe(faces));
		nbrDes++;
		 iterateurDeLaCollection.next();
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
	public Iterator<De> iterator() {
		return ListeDe.iterator(); 

		}
	
	/**
	 * Permet de savoir si l'element dispose d'un
	 * de suivant
	 * @return boolean
	 */
	public boolean hasNext(){
		if(iterateurDeLaCollection.hasNext())
			return true;
		return false;
	}
	
	/**
	 * Methode qui retourne le de 
	 * de la collection
	 * @return De
	 */
	public De retourneDe(){
		return null;
	}
}