package SEPT.Ex_22092024;

public class Lab037_Switch {
    public static void main(String[] args) {
        int a=7;
        switch (a)
        {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("No Idea what is day");
                break;
        }
        System.out.println("End of Loop");
    }
}
