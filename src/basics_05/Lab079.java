package src.basics_05;

import java.util.Scanner;

public class Lab079
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n");
       int n = sc.nextInt();

        for (int i = n ; i < 100; i++)
        {
            System.out.println(i);
            if(i%2 == 0)
            {
                break;
            }
        }

    }
}
