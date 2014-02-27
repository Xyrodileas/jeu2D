package jeu2D;

/**
 * Classe : public class 
 * Permet de fabriquer les des souhaites
 *
 */

public class FabriqueDe {

	

	/**
	 * Permet de construire un de
	 * 6 face par defaut et le retourne
	 * @return De
	 */
  public static De nouveauDe() {
	  return new De();
  }
  
  
  /**
   * Permet de creer un De
   * selon le nombre de face souhaite
   * 
   * @param nbFace
   * @return De ( avec le nombre de faces souhaite)
   */
  public static De nouveauDe(int nbFace) {
	  return new De(nbFace);
  }
  
  /**
   * Methode qui permet
   * de retourner un tableau
   * de des
   * @param nbDe (Nombre de de voulu)
   * @param nbFaces (Nombre de face souhaite)
   * @return De[] tabDe
   */
  public static De[] nouveauDe(int nbDe, int nbFaces) { 
	  
	  	De[]tabDe= new De[nbDe];
	  	for(int i=0;i<nbDe;i++)
	  		tabDe[i]= new De(nbFaces);
	  	new De();
	  	return tabDe;
  }
  

}