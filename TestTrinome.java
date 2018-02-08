import java.util.Scanner; //importe la class java.util.Scanner

public class TestTrinome {
	public static void main(String[] args){
		Scanner lectureClavier = new Scanner(System.in); 		//ouvre un scanner
		System.out.println("a? : ");
		while(!lectureClavier.hasNextInt()) {
			System.out.println("error: enter a correct value");
			System.out.println("a? : ");
			lectureClavier.next(); 					//lit le prochain entier
		} 					//en cas d'exception demande a l'utilisateur  de choisir un int
		double a=lectureClavier.nextInt();
	
		System.out.println("b? : ");
		while(!lectureClavier.hasNextInt()) {
			System.out.println("error: enter a correct value");
			System.out.println("b? : ");
			lectureClavier.next();
		}
		double b =  lectureClavier.nextInt();
		
		System.out.println("c? : ");
		while(!lectureClavier.hasNextInt()) {
			System.out.println("c? : ");
			lectureClavier.next();
		}
		double c = lectureClavier.nextInt();
		lectureClavier.close(); 			//ferme le scanner
		System.out.println(""+ a + "x² + " + b + "x + " + c);
		Trinome t;
		t= new Trinome(a,b,c);
		t.calculRacines();
		t.afficheRacines();
		t.afficheRacineJOptionPane();
	}
}
