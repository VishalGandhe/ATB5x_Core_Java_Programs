package src.oop_1;

public class Animal {
    void Eating(){
        System.out.println("Eating");
    }
  public static   class Dog extends Animal{
        void  Barking(){
            System.out.println("Barking");
        }

        public static class BDog extends Dog{
            void Sleeping(){
                System.out.println("Sleeping");

            }
          public  static class Test{
                public static void main(String[] args) {
                    BDog bd = new BDog();
                    bd.Eating();
                    bd.Barking();
                    bd.Sleeping();
                }

            }
        }

    }}

