package src.basics_04;

public class Lab059
{
    public static void main(String[] args)
    {
        // JDK 13
        int itemCode = 003;
        switch (itemCode) {
            case 001, 002, 003 :
                System.out.println("It's an electronic gadget!");
                break;
            case 004, 005:
                System.out.println("It's a mechanical device!");
            default:
                System.out.println("It's a software product!");
        }

    }
}
