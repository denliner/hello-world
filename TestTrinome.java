import java.util.Scanner; //importe la class java.util.Scanner

public class TestTrinome {
	public static void main(String[] args){
		System.out.println("a? : ");
		Scanner lectureClavier = new Scanner(System.in); //ouvre un scanner
		double a = lectureClavier.nextInt(); //lit le prochain entier et initialise a
		System.out.println("b? : ");
		double b =  lectureClavier.nextInt();
		System.out.println("c? : ");
		double c = lectureClavier.nextInt();
		lectureClavier.close(); //ferme le scanner
		System.out.println(""+ a + "x² + " + b + "x + " + c);
		Trinome t;
		t= new Trinome(a,b,c);
		t.calculRacines();
		t.afficheRacines();
		t.afficheRacineJOptionPane();
	}
}
