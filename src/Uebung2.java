
public class Uebung2 {

	public static void main(String[] args) 
	{
		String myString1 = new String("Der Wagenheber");
		String myString2 = new String("Der Wagenheber");
		
		boolean vergleich1 = myString1 == myString2;
		boolean vergleich2 = myString1.equals(myString2);
		
		
		System.out.println(vergleich1);
		System.out.println(vergleich2);
	}


}
