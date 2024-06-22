package src.oop_1;

public class Lab081 {

   public static class Student {
        int id;
        String name;

        Student(int i, String n){
            id = i;
            name= n;
        }
        void display(){
            System.out.println("Student Info" + id + name);
        }

        public static void main(String[] args) {
            Student student = new Student(   444, " Vishal");
            student.display();

        }


    }
    }





