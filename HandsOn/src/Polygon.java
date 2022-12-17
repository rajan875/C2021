import java.util.Scanner;

public class Polygon {
	static double Perimeter(int n, double l )
	{
		double perimeter = 1;
	    perimeter = n * l;
	    return perimeter;
	}

    public static void main(String args[])
    {
        System.out.println("Enter number of sides: ");
		Scanner newobj1 =new Scanner(System.in);
        int n = newobj1.nextInt();

        System.out.println("Enter length of side ");
		Scanner newobj2 =new Scanner(System.in);
        double l = newobj2.nextDouble();
        
        double peri = Perimeter(n, l);
        
        System.out.println("Perimeter of Polygon is: "+ peri);
        
        double angle= Math.toRadians(180/n);
        angle=Math.tan(angle);
        double area=((l*l*n)/(4*angle));
        System.out.println("Area of Polygon is: "+area);
        
        double sqrper=4*l;
        System.out.println("Perimeter of Square is: "+sqrper);
        
        double sqrare=l*l;
        System.out.println("Area of Square is: "+sqrare);
        
        
        
        
    }
}
	