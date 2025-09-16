import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        printRandom3(100);
        printRandom3(15);
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        int numOfNums;
        System.out.println("Enter a positive number");
        numOfNums = scan.nextInt();
        printRandom3(numOfNums);

        double c = calcSlope(0, 0, 1, 1);
        System.out.println(c);

        double a = 2.2;
        double b = 9.6;
        System.out.println(roundedDist(a, b));
    }
    
    public static void printRandom3(int num)
    {
        // Do problem 1 here
        //(int)(Math.random() * (b-a+1) + a);
        int lowerBound = 2;
        int upperBound = num + 2;
        System.out.println( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );
        System.out.println( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );
        System.out.println( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );
    }
    
    public static double calcSlope(double x1, double y1, double x2, double y2)
    {
        // Do problem 2 here; replace code below
        //calcSlope = ((x2-x1)/(y2-y1));
        //x1 = 0;
        //y1 = 1;
        //x2 = 0;
        //y2 = 1;
        double m = ((y2 - y1) / (x2 - x1));
        System.out.print(m);
        return m;
    }
    
    public static int roundedDist(double a, double b)
    {
        int distance = ((int) (b - a));
        System.out.print(distance);
        return distance;
    }
}
