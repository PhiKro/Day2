
public class Uebung3 {

	public static void main(String[] args) {

		String City = ("Graz");
		boolean isCapital = true;
		int inhabitants = 100_000;
		double taxPPM = 500;
		
		boolean ergebniss = isMetropolis(isCapital,inhabitants,taxPPM);
		if (ergebniss)
		{
			System.out.println(City +" ist eine Metropole");
		}
		else 
		{
			System.out.println(City +" ist eine Vorstadtprovinz");
		}
		

	}

	public static boolean isMetropolis(boolean isCapital,int inhabitants,double taxPPM )
	{
	if (isCapital && inhabitants > 100_000)
		{
			return true; 
		}
	else if (isCapital == false && inhabitants >200_000 && (inhabitants*taxPPM*12) >720_000_000)
		{
			return true ;
		}
	else 
		{
			return false;
		}
	}
}
