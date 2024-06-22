package src.Collection;
import java.util.Collection;
import java.util.LinkedList;

public class LinkList_2 {

    public static void main(String[] args) {

        LinkedList<String> linkList=new LinkedList<String>();
        linkList.add("Ravi");
        linkList.add("Vijay");
        linkList.add("Ravi");
        linkList.add("Ajay");

    //    Collection.sort(linkList);

        for(String name:linkList){
            System.out.println(name);
        }



    }
}
