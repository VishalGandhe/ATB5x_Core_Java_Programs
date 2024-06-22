package src.Collection;

import java.util.ArrayList;

public class ArrayList_1 {

    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
//Traversing list through Iterator

        System.out.println("Before removing element  " + list);

        list.remove(3);

        System.out.println("After Removing Element  " + list);

      //  System.out.println("Get special value only  " + list.get(1));

     //   list.set(0,"Vishal");

        for(String name:list){
            System.out.println(name);
        }
    }
}

