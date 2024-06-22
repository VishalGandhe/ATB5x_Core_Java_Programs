package src.Collection;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayList_2 {

    public static void main(String args[]){

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(21);
        list1.add(2);
        list1.add(1);
        list1.add(221);
        list1.add(0);
        list1.add(1);
        list1.add(3);


      Collections.sort(list1);

        for(Integer arraysort:list1){
            System.out.println(arraysort);
        }
    }
}

