package SEPT.Ex_22092024;

public class Lab043_Month_Names_Using_switch {
    public static void main(String[] args) {
       /* Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
                Input  - 12
        Out - Dec.*/
        char ch=12;
        switch (ch)
        {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("NONE");
                break;
        }
    }
}
