package src.myPractice;

public class Lab004_Duplicate_Char_InString {
    public static void main(String[] args) {

        String str = " Maximum and Minimum";
        char[] cArray = str.toCharArray();
        System.out.println("The string is " + str);
        System.out.print("Duplicate chars in String are --->>>>  ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (cArray[i] == cArray[j]) {
                    System.out.print(cArray[j] + ",");
                    break;
                }
            }
        }


//            String str1 = "Maximum and Minimum";
//            int count;
//            System.out.println("The entered string is: "+str1);
//            //Converts given string into character array
//            char str[] = str1.toCharArray();
//
//            System.out.println("Duplicate characters in a given string: ");
//            //Count the frequency of each character present in the string
//            for(int i = 0; i <str.length; i++)
//            {
//                count = 1;
//                for(int j = i+1; j <str.length; j++)
//                {
//                    if(str[i] == str[j] && str[i] != ' ')
//                    {
//                        count++;
//                        //Set string[j] to 0 to avoid printing visited character
//                        str[j] = '0';
//                    }
//                }
//                //A character is considered as duplicate if count is greater than 1
//                if(count > 1 && str[i] != '0')
//                    System.out.println(str[i]);
//            }
//        }
//
//    }

    }
}