package src.oop_1;

public class inheritance {

    int salary = 1000;

}

class demo extends inheritance{

    int bouns = 500;
    demo(){
        System.out.println("Child Class");
    }

    public static void main(String[] args) {

        demo d1 =new demo();
        System.out.println(d1.salary);
        System.out.println(d1.bouns);

    }
    }
