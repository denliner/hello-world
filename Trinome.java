import javax.swing.JOptionPane; //importe la Class swing.JOptionPane pour l'exo 3

public class Trinome {
	private double a,b,c;
	private double delta;
	private double r1, r2;
	
	public Trinome(double c1,double c2, double c3){
		a=c1; 
		b=c2;
		c=c3;
		//Math.pow(b, 2.0) <=> b²
		delta=(Math.pow(b,2.0)- 4*a*c); 
	}

	
	public void calculRacines(){
		double racine=Math.sqrt(delta); //racine carré
		if(delta==0) {
			r1= (-b)/(2*a);
			System.out.println("Le trinome possède une seule racine");
	 	}
	 	else { 
	 		if(delta>0) {
	 			System.out.println("Le trinome possède deux racines");
	 			r1= ((-b)+ racine)/(2*a);
	 			r2= ((-b)-racine)/(2*a);
	 		}
	 		else { 
	 			System.out.println("Le trinome n'a pas de racine");
	 		}

	 	}	
	}
 

	public void afficheRacines(){
		if (delta==0) {
			System.out.println("r : " + r1);
		}
		else { 
			if (delta<0) {
				System.out.println("Aucune solution \n => delta<0");
		}
			else {
				System.out.println("r1 : " + r1);
				System.out.println("r2 : " + r2);
			}
		}
	}
	
	public void afficheRacineJOptionPane() { //exo 3
		if(delta<0) {
			JOptionPane.showMessageDialog(null, "Aucune racine");
			//ouvre une boite de dialogue contenant la chaine "Aucune racine"
		}
		else { 
			if (delta==0) {
				JOptionPane.showMessageDialog(null, "Racine = " + r1); 
			}
			else {
				JOptionPane.showMessageDialog(null, "Racine1 = " + r1 + "\n" + "Racine2 = " + r2); 
			}
		}
	}
}
