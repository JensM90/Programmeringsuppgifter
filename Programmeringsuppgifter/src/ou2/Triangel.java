package ou2;

class Triangel
{
    /*
    public static double Area (double bas, double hojd)
    {
        double area = (bas * hojd) / 2;
        return area;
	}

	public static double Omkrets (double a, double b, double c)
	{
		double omkrets = a + b + c;
		return omkrets;
	}

	public static double Bisektris1 (double a, double b, double alfa)
	{
		double p = (2 * a * b * Math.cos (alfa / 2)) / (a + b);
		double bis = p / (a + b);
		return bis;
	}

	public static double Bisektris2 (double a, double c, double alfa)
	{
		double p = (2 * a * c * Math.cos (alfa / 2)) / (a + c);
		double bis = p / (a + c);
		return bis;
	}

	public static double Bisektris3 (double b, double c, double alfa)
	{
		double p = (2 * b * c * Math.cos (alfa / 2)) / (b + c);
		double bis = p / (b + c);
		return bis;
	}
	*/
	
	public static double Semiperimeter (double a, double b, double c)
	{
		double semiperimetern = (a + b + c) / 2;
		return semiperimetern;
	}
	
	public static double RadienOmskrivnaCirkeln (double a, double b, double c)
	{
		double s = Triangel.Semiperimeter(a, b, c);
		double RadienOmskrivna = (a * b * c) / (4 * (Math.sqrt(s*(s - a) * (s - b) * (s - c))));
		return RadienOmskrivna;
	}
	
	public static double RadienInskrivnaCirkeln (double a, double b, double c)
	{
		double s = Triangel.Semiperimeter(a, b, c);
		double RadienInskrivna = Math.sqrt((((s - a) * (s - b) * (s - c)) / s));
		return RadienInskrivna;
	}
}