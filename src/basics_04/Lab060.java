package src.basics_04;

public class Lab060 {
    public static void main(String[] args) {
        // JDK > 13
        // ->

        int itemCode = 006;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004, 005-> System.out.println("It's a mobile phone!");
            default -> System.out.println("Hello!");

        }
    }
}
