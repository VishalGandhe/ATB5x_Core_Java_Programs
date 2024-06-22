package src.oop_1;

abstract class Bike {
//Parent
    Bike(){
        System.out.println("Bike Running");
    }
    abstract void run();

    void gearChange(){
        System.out.println("Bike can change the gear");
    }
     static class Honda extends Bike{

        void run (){
            System.out.println("Honda Bike is Running");
        }
    }
    public static class TestRunner{

        public static void main(String[] args) {
            Bike  b1= new Honda();
            b1.run();
            b1.gearChange();
        }



    }
}


