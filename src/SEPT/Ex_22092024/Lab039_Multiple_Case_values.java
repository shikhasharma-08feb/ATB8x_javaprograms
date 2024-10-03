package SEPT.Ex_22092024;

public class Lab039_Multiple_Case_values {
    public static void main(String[] args) {
        int itemcode=006;
        switch (itemcode)
        {
            case 001,002,003->
                System.out.println("all are Electric gadgets");
                //-> used for in place of break will work in JDK>13
            case 004,005,006->
                System.out.println("This is Mech");

            default->
                System.out.println("No Idea");


        }
        System.out.println("End");
    }
}
