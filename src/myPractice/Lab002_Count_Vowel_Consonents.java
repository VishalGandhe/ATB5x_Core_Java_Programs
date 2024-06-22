package src.myPractice;

public class Lab002_Count_Vowel_Consonents
{
    public static void main(String[] args) {

        int vCount =0, cCount=0;
        String str= "I'm Vishal Gandhe and practicing Java ";

     str= str.toLowerCase();

       for(int i=0; i< str.length();i++){
           if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){

               vCount++;

           }else if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
               cCount++;
           }
       }
        System.out.println("Voewl count is " + vCount);
        System.out.println("Consonent count is " + cCount);
    }


}
