package src.basics_04;

import java.util.Scanner;

public class Lab063
{
    public static void main(String[] args)
    {
        // This program is ask is in interview
        //  A = x^2
        // B - y^2
        // c = |z| ->
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value of A ");
        double a= sc.nextDouble();

        System.out.println("Enter the value of B ");
        double b= sc.nextDouble();

        System.out.println("Enter the value of C ");
        double c= sc.nextDouble();

        double result;

        // A - B + C  where A= a^2   B= - b^2   C= |c|

        result=(Math.pow(a,2) - Math.pow(b,2) + Math.abs(c));
        System.out.println(result);

        sc.close();







    }
}
