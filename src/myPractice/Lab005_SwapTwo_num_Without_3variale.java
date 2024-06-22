package src.myPractice;

public class Lab005_SwapTwo_num_Without_3variale {
    public static void main(String[] args) {
        //Write a Program for swap 2 no without using third variables.
        int x = 20;
        int y = 30;

        //print no here before swap
        System.out.println("Before Swapping::" + "\n" + x + " " + y);
        //swap logic

        x = x + y; //  20+30 =50   // x=50
        y = x - y;  //30 -50 = 20   // y=20
        x = x - y;   // 50-20 //x=30
        System.out.println("After Swapping the no::" + "\n" + x + " " + y);
    }
}