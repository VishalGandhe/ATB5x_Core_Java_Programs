package src.basics_02;

public class Lab007
{
    /**
     * Author - Vishal Gandhe
     * Program - Showcase difference between println vs print
     * */
    public static void main(String[] args)
    {
        System.out.println("Hello World");
//        System.out.println("Vishal");
        int age = 34;
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float

        System.out.printf("Your Age is  %d",age);
    }
}
