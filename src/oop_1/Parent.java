package src.oop_1;

public class Parent {
   public int parentData;

  public   Parent (int parentData)
  {
        this.parentData= parentData;

    }
    void  toDisplayParentData()
    {
        System.out.println("Parent Data: " + parentData);
    }

    public static class Child extends Parent{

      public   int childData;
       public Child(int parentData, int childData)
       {
           super(parentData);
           this.childData=childData;

       }

        public void displayChildData()
        {
            System.out.println("Child Data: " + childData);
        }

    }

    public static void main(String[] args) {
        Child child = new Child(40,20);

        child.toDisplayParentData();
        child.displayChildData();

    }
}
