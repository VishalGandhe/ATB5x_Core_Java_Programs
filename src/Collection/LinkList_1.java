package src.Collection;
import  java.util.*;
import java.util.LinkedList;

public class LinkList_1 {

    public static void main(String[] args) {

        LinkedList<String> linkList=new LinkedList<String>();
        linkList.add("Ravi");
        linkList.add("Vijay");
        linkList.add("Ravi");
        linkList.add("Ajay");

        System.out.println("Before Removing Element " + linkList);

        linkList.remove(3);

        System.out.println("After removing element " + linkList);

        for(String name:linkList){
            System.out.println(name);
        }



    }
}
