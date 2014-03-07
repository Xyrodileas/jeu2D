package Graphique;

import javax.swing.*;
import java.awt.*;
import java.io.File;


  public class PanneauD extends JPanel  {


		public static final String CHEMIN_REP = System.getProperty("user.dir").replace("src", "");
		
			
			//Tableau d image
			ImageIcon[] tableau_image=new ImageIcon[6];
			
			DeGraphique[][] tabBouttons;
            DeGraphique[] tabBouttons2;
            DeGraphique[] tabBouttons3;
            int joueurs;
			
			
			public PanneauD(int x){
				
				joueurs = x;
				creerIcon(tableau_image);
                tabBouttons = new DeGraphique[joueurs][3];
				for(int i=0; i<x; i++){
				    //Creation du tableau de bouton selon image face du de
				    creerTableauDeBoutton(tableau_image, tabBouttons[i]);
                }

				
				
				
			}
			
			
			public void creerTableauDeBoutton(ImageIcon[] tableau_image,DeGraphique[] tableau_bouton){
                        for(int i = 0; i <3; i++){
                            tableau_bouton[i] =new DeGraphique();
                            System.out.println(tableau_image[i]);
                            add(tableau_bouton[i]);
                        }
					validate();
					repaint();
			}
			
			
			public void lancerDes(int i, int de1,int de2,int de3){

				//this.reinitialiserBoutonNull();

                tabBouttons[i][0].setIcon(tableau_image[de1-1]);tabBouttons[i][0].setText(null);
                tabBouttons[i][1].setIcon(tableau_image[de2-1]);tabBouttons[i][1].setText(null);
                tabBouttons[i][2].setIcon(tableau_image[de3-1]);tabBouttons[i][2].setText(null);
                validate();
                repaint();
			}

			public void reinitialiserBoutonNull(){

                for(int x =0; x<joueurs; x++){
                    for(int i=0;i<tabBouttons[x].length;i++){
                        tabBouttons[x][i].setIcon(null);
                        tabBouttons[x][i].setText("De");

                    }
                }
				validate();
				repaint();
			}
			
		
			
			private void creerIcon(ImageIcon[] image){
			
				File f;
				String [] s;
	
				f = new File(CHEMIN_REP+"\\src\\"+"\\images\\");
				s = f.list(null);
				for(int i = 0; i < s.length;i++){
					image[i] = new ImageIcon(CHEMIN_REP+"\\src\\"+"\\images\\"+s[i]);
			}
				
		}
		
		
			public class DeGraphique extends JButton{

				ImageIcon imageDuBoutton;
				
		
				public DeGraphique(){
					

					this.setBackground(Color.white);
					this.setVisible(true);
					this.setText("De");
					
					
				}
				
				
		}
  }