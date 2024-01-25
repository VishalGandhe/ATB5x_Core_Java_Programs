package src.basics_04;

public class Lab058 {
    public static void main(String[] args) {
        byte b = 10;
        switch (b) {
            case 10:
                System.out.println("TEN");
                break;
            case 127:
                System.out.println("ONE TWENTY EIGHT");
            default:
                System.out.println("Default");
        }
    }
}
