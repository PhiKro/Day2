
public class Temperatur {
	
	
	public static void main(String[] args) 
	{
	double temp = 39; // definieren der Variable 
	double ergebnissf = celsius2Fahrenheit(temp); // Aufrufen der Unterfunktion mit dem Übergabe Wert aus der Variable Temp.
	System.out.println(temp+" Grad Celsius sind "+ergebnissf+" Grad Fahrenheit"); // Ausgabe des Ergebnisses
	double ergebnissc = fahrenheit2Celsius(temp);
	System.out.println(temp+" Grad Fahrenheit sind "+ergebnissc+" Grad Celsius");
	
	temp = 23; // Update der bestehenden Variable
	ergebnissf = celsius2Fahrenheit(temp);
	System.out.println(temp+" Grad Celsius sind "+ergebnissf+" Grad Fahrenheit");
	ergebnissc = fahrenheit2Celsius(temp);
	System.out.println(temp+" Grad Fahrenheit sind "+ergebnissc+" Grad Celsius");
	
	temp = 17;
	ergebnissf = celsius2Fahrenheit(temp);
	System.out.println(temp+" Grad Celsius sind "+ergebnissf+" Grad Fahrenheit");
	ergebnissc = fahrenheit2Celsius(temp);
	System.out.println(temp+" Grad Fahrenheit sind "+ergebnissc+" Grad Celsius");
	}

	public static double celsius2Fahrenheit(double temp)
	{
		return (9.0/5.0)*temp+32;
	}
	public static double fahrenheit2Celsius(double temp)
	{
		return temp-32/(9.0/5.0);
	}
}
