package SEPT.Ex_22092024;

public class Lab042_CalC_using_Switch_Task {
    public static void main(String[] args) {
        /*Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.

                Inputs :   num 1, num 2, +
                Output :  num1+num2 → print information.*/
        int a=3;
        int b=66;
        int c;
        char ch = 5;

        switch (ch)
        {
            case 1:
                c=a+b;
                System.out.println(c);
                break;
            case 2:
                c=a-b;
                System.out.println(c);
                break;
            case 3:
                c=a*b;
                System.out.println(c);
                break;
            case 4:
                c=a/b;
                System.out.println(c);
                break;
            case 5:
                c=a%b;
                System.out.println(c);
                break;
            default:
                System.out.println("NONE");
        }

    }
}
