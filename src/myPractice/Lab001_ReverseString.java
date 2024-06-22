package src.myPractice;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Lab001_ReverseString
{
    public static void main(String[] args) {

//        String s="Vishal", rstr = "";
//        char ch;

        String s1,rstr="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you String ");
        s1 = sc.nextLine();



        for (int i = 0; i < s1.length(); i++) {
//            ch = s.charAt(i); //extracts each character
            rstr = s1.charAt(i) + rstr; //adds each character in front of the existing string}

        }
        System.out.print("Reverse String is "  + rstr);
    }
}
