package Graphique;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


  public class PanneauD extends JPanel  {


		public static final String CHEMIN_REP = System.getProperty("user.dir").replace("src", "");
		
			
			//Tableau d image
			ImageIcon[] tableau_image=new ImageIcon[6];
			
			DeGraphique[] tabBouttons;
			
			
			public PanneauD(){
				
				
				creerIcon(tableau_image);
				
				tabBouttons=new DeGraphique[3];
				

				setLayout(new GridLayout(1,6));
				
				
				//Creation du tableau de bouton selon image face du de
				creerTableauDeBoutton(tableau_image, tabBouttons);
				
				
				
			}
			
			
			public void creerTableauDeBoutton(ImageIcon[] tableau_image,DeGraphique[] tableau_bouton){

					for(int i = 0; i <3; i++){
						tabBouttons[i] =new DeGraphique();
						System.out.println(tableau_image[i]);
						add(tabBouttons[i]);
					}
					validate();
					repaint();
			}
			
			
			public void lancerDes(int de1,int de2,int de3){

				//this.reinitialiserBoutonNull();
				
				tabBouttons[0].setIcon(tableau_image[de1-1]);tabBouttons[0].setText(null);
				tabBouttons[1].setIcon(tableau_image[de2-1]);tabBouttons[1].setText(null);
				tabBouttons[2].setIcon(tableau_image[de3-1]);tabBouttons[2].setText(null);
				validate();
				repaint();
			}
			public void reinitialiserBoutonNull(){
				
				for(int i=0;i<tabBouttons.length;i++){
					tabBouttons[i].setIcon(null);
					tabBouttons[i].setText("De");
					
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