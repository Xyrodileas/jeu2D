package jeu2D;

import java.util.Iterator;
import java.util.Vector;


/**
 * CollectionDes qui va permettre
 * de stocker les des des joueurs
 *
 */
public class CollectionDes<De> implements Iterable<De> {

	public Vector<De> ListeDe;
	private int nbrDes;

	
	/**
	 * Constructeur : CollectionDes
	 * Permet de cr�er une collection vide de des
	 * et indique le nombre de des=0
	 */
    public CollectionDes(){
        ListeDe = new Vector<De>() ;
        nbrDes =0;
    }
    
	
	/**
	 * Constructeur : CollectionDes
	 * Permet de cr�er une collection avec des dés
	 */
    public CollectionDes(int nbDe, int nbFaces){
        ListeDe = new Vector<De>() ;
        nbrDes=nbDe;
        for(int i=0;i<nbDe;i++)
        	ListeDe.add((De)FabriqueDe.nouveauDe(nbDe, nbFaces)[i]);

    }
    
    
   
    /**
     * Permet d'ajouter un de � la collection
     * selon le nombre de face souhait�
     * @param faces
     */
	public void ajouterDe(int faces) {
		ListeDe.add((De)FabriqueDe.nouveauDe(faces));
		nbrDes++;
	}
    public void ajouterDe(int faces, int des){
        De[] tab = (De[]) FabriqueDe.nouveauDe(des, faces);
        for(int x = 0; x<tab.length; x++){
            ListeDe.add(tab[x]);
        }
        nbrDes += des;
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
	 * Permet d'instancier un it�rateur
	 * sur la Collection de De
	 */
	@Override
	public Iterator<De> iterator() {
		return new Iterator<De>() {

			private int positionCourante = -1;

			/**
			 * Permet de retourner le De suivant dans
			 * le vecteur de De (Collection)
			 * 
			 * Consequent :
			 * 			si il n'y a pas de suivant il leve une exception qui directement gerer
			 * 			en retournant un boolean false sinon si suivant existe alors retourne vrai
			 */
            @Override
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
			 * Permet de se positionner
			 *  la position courante
			 *  et de renvoyer l element ( le De)
			 */
            @Override
			public De next() {
				positionCourante++;
				return ListeDe.elementAt(positionCourante);
			}



			
			
			/**
			 * Methode qui permet de supprimer
			 * l'element � la position courante
			 */
            @Override
			public void remove() { //TODO Tester la méthode
				ListeDe.remove(positionCourante);
                this.positionCourante--;
			}
		};
	}
}