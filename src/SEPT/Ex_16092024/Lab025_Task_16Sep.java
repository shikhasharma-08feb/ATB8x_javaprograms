package SEPT.Ex_16092024;

public class Lab025_Task_16Sep {
    public static void main(String[] args) {
        /*1.Difference between = and  ==?

        2.byte b = 10; long l = 10l; → How much Byte will be used.

        3.Another byte b = 10; byte c = 10;  What is the anwser if the perform b+c, What is the data type it will give in result.

        4.short s = 10;

        char c = 'A'; //65

        int ss = s+c;

        System.out.println(ss);*/
        System.out.println("Answer No 1: = operator is used to assign the value and == operator is used for comparision between two or more than two operands");
        int a=10 ; // = operator
        int b=10;
        boolean c=a==b; // comparison operator

        System.out.println("Answer No 2: byte b will use 1 Byte and long l will use 8 Bytes total 9 Bytes will be used");

        System.out.println("Answer No 3: 20 will be answer and b+c will return int data type ");

       /* byte a1=10;
        byte b1=10;
        byte c1= (byte) (a1+b1);
        System.out.println(c1);*/

        System.out.println("Answe No 4: 75");

        short s = 10;
        char c2 = 'A'; //65
        int ss = s+c2;

        System.out.println(ss);



    }
}
