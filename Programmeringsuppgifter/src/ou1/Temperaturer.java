package ou1;

import java.util.*;     // Scanner, Locale

class Temperaturer
{
	public static void main (String[] args)
    {
        System.out.println ("TEMPERATURER\n");

        // inmatningsverktyg
        Scanner    in = new Scanner (System.in);
        in.useLocale (Locale.US);

        // mata in uppgifter om antalet veckor och antalet m�tningar
        System.out.print ("antalet veckor: ");
        int    antalVeckor = in.nextInt ();
        System.out.print ("antalet m�tningar per vecka: ");
        int    antalMatningarPerVecka = in.nextInt ();

        // plats att lagra temperaturer
        double[][]    t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];

        // mata in temperaturerna
        for (int vecka = 1; vecka <= antalVeckor; vecka++)
        {
            System.out.println ("temperaturer - vecka " + vecka + ":");
            for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
                t[vecka][matning] = in.nextDouble ();
        }
        System.out.println ();

        // visa temperaturerna
        System.out.println ("temperaturerna:");
        for (int vecka = 1; vecka <= antalVeckor; vecka++)
        {
            for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
                System.out.print (t[vecka][matning] + " ");
            System.out.println ();
        }
        System.out.println ();

        // den minsta, den st�rsta och medeltemperaturen � veckovis
        double[]    minT = new double[antalVeckor + 1];
        double[]    maxT = new double[antalVeckor + 1];
        double[]    sumT = new double[antalVeckor + 1];
        double[]    medelT = new double[antalVeckor + 1];
        for (int i = 1; i < t.length; i++)
        {
			minT[i] = t[i][1];
			maxT[i] = t[i][1];
			sumT[i] = t[i][1];
		    for (int j = 2; j < t[i].length; j++)
		    {
				if (t[i][j] < minT[i])
				    minT[i] = t[i][j];
				else if (t[i][j] > maxT[i])
				    maxT[i] = t[i][j];
				sumT[i] += t[i][j];
			}
			medelT[i] = sumT[i] / (t[i].length - 1);
		}

        // visa den minsta, den st�rsta och medeltemperaturen f�r varje vecka
        System.out.println ("Minsta, st�rsta och medeltemperaturen - veckovis:");
        for (int i = 1; i < t.length; i++)
            System.out.printf ("%4.1f   |   %4.1f   |   %7.1f\n", minT[i], maxT[i], medelT[i]);
        System.out.println ();


        // den minsta, den st�rsta och medeltemperaturen - hela m�tperioden
        double    minTemp = minT[1];
        double    maxTemp = maxT[1];
        double    sumTemp = sumT[1];
        double    medelTemp = 0;
        for (int i = 2; i < t.length; i++)
        {
            if (minT[i] < minTemp)
                minTemp = minT[i];
            else if (maxT[i] > maxTemp)
                maxTemp = maxT[i];
            sumTemp += sumT[i];
		}
		medelTemp = sumTemp / ((t.length - 1) * (t[0].length - 1));

        // visa den minsta, den st�rsta och medeltemperaturen i hela m�tperioden
        System.out.println ("Minsta, st�rsta och medeltemperaturen - hela m�tperioden:");
		System.out.printf ("%4.1f   |   %4.1f   |   %7.1f\n", minTemp, maxTemp, medelTemp);
        System.out.println ();
    }
}
