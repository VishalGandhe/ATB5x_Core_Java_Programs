package src.myPractice;

public class Lab003_Duplicate_Num_InArray {

    public static void main(String[] args) {


        int arr[]= {1,2,2,5,3,4,6,4,8,9,7,5};

        System.out.println("Duplicate elements in array:-----");

        for (int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){

                    System.out.print(arr[j] + ",");
                }
            }

        }

    }
}
