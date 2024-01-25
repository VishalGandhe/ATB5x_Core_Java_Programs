package src.basics_03;

public class Lab029
{
    public static void main(String[] args)
    {
        String s1 = "Vishal";
        // String Constant Pool - SCP / String Pool

        // new Operator - Object
        String s2 = new String("Vishal");
        //new operator is used to create the new object for class.
        // It returns of the address of newly created object.
        System.out.println(s2);
        System.out.println(new String("Vishal"));
        System.out.println(s1);
        System.out.println(new String("Vishal"));

    }
}
