package src.interview_practice_program;

import java.util.Scanner;

public class ReverseStringUsingStrBuilder
{
    public class ReverseStr {

    }
        public static void main(String[] args) {
            //System.out.println(revStr("apple")); // elppa

            String s;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your String :--");
            s=sc.nextLine();
        }

        public static String revStr(String str) {
            // create variable to store reversed version of str
            StringBuilder res = new StringBuilder();

            // iterate over input string from the back and use charAt() to get single char
            for (int i = str.length() - 1; i >= 0; i--) {
                res.append(str.charAt(i));
            }

            // convert to string and return reversed version
            return res.toString();
        }
}
