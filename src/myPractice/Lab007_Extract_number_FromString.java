package src.myPractice;

import java.util.Scanner;

public class Lab007_Extract_number_FromString {

    public static void main(String[] args)
    {
        String str = "Visha223l";
        char ch;
//        Scanner s = new Scanner(System.in);
        System.out.println("Given string---> " + str);
//
//        System.out.print("Enter the String: ");
//        str = s.nextLine();

        System.out.print("Numbers available in the String are:--> ");
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(Character.isDigit(ch))
                System.out.print((ch) + ",");

        }

    }
}
