package src.myPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Lab006_Find_2nd_LargeNumberFrom_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String  a = scanner.next()

        int [] array = {0,8,9,1,2,3,-1,23,12,35};
        //find length of array
        int size = array.length;

        System.out.println("Size of Array is " + size);

        //sort array
         Arrays.sort(array);
         System.out.println("sorted array will be " + Arrays.toString(array));

        //logic

        int result = array[size -2];

        System.out.println("2nd largest ele---> " + result);



    }
}
