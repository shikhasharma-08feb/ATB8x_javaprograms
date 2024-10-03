package SEPT.Ex_22092024;

public class Lab044_Task_03 {
    public static void main(String[] args) {
        /*Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
                Input. -
                choice - 1 - km → m, km → 1km
        choice - 2 - f → c, f → c*/
        int km=1;
        int meter;
        double fahrenheit;
        float celsius=5;
        char ch=1;
        switch (ch)
        {
            case 1:
            meter=km*1000;
            System.out.println(meter);
            break;
            case 2:
                fahrenheit = (9.0 / 5.0) * celsius + 32;
                System.out.println(fahrenheit);
                break;


        }

    }
}
