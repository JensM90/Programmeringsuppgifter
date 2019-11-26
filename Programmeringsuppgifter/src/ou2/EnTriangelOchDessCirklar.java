package ou2;

import java.util.Locale;
import java.util.Scanner;

class EnTriangelOchDessCirklar
{
	public static void main (String[] args)
	{
		Scanner    in = new Scanner (System.in);
		in.useLocale (Locale.US);
		
		System.out.println ("TRIANGEL");
		System.out.print ("\n" + "Ange triangelns sida a: ");
		double a = in.nextDouble();
		System.out.print ("Ange triangelns sida b: ");
		double b = in.nextDouble();
		System.out.print ("Ange triangelns sida c: ");
		double c = in.nextDouble();
		
		System.out.println ("\n" + "Radien omskrivna cirkeln: " + Triangel.RadienOmskrivnaCirkeln(a, b, c));
		System.out.println ("Radien inskrivna cirkeln: " + Triangel.RadienInskrivnaCirkeln(a, b, c));	
	}
}