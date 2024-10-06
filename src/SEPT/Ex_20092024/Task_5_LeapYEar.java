package SEPT.Ex_20092024;

public class Task_5_LeapYEar {
    public static void main(String[] args) {
        int year=2024;
        if(year%100==0) {
            if (year % 400 == 0) {
                System.out.println("leap year");
            } else {
                System.out.println("Not a leap year");
            }
        }
            {
                if(year%4==0)
                {
                    System.out.println("leap year");
                }
                else
                {
                    System.out.println("Not a Leap year");
                }

            }

        }
    }
