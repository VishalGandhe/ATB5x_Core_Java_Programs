package src.oop_1;

public class Demo {

    int id;
    String name;
    int age;

    Demo(int i, String n, int a){
        id = i;
        name= n;
        age = a;
    }
//    Demo(int i, String n, int a){
//
//        id = i;
//        name =n;
//        age= a;
//    }
    void display(){
        System.out.println("Info " +  id +  name +  age);
    }

    public static void main(String[] args) {
       // Demo d2= new Demo(111, " Vishal ");
        Demo d1= new Demo(123," ankit ",  26);
        d1.display();
        //d2.display();
    }

}
