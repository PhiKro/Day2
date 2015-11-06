
public class Uebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Variablen Definieren
		
		double konto = 1000;
		double zinsen = 1.5; 
		
		double ergebniss = berechneZinsen(konto, zinsen);
		System.out.println(ergebniss);
		
		
	}

	public static double berechneZinsen(double konto, double zinsen)
	{
		return konto*zinsen/100;
	}
	
}
