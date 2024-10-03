package SEPT.Ex_20092024;

public class Lab036_Task {
    public static void main(String[] args) {
       /* Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number,
        and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."*/
        int i;
        for (i=1;i<=100; i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.printf("Value %d:", i);
                System.out.print("FizzBuzz");
                System.out.println();
            }
               else if(i%3==0)
            {
                System.out.printf("Value %d:", i);
                System.out.print("Fizz");
                System.out.println();
            }
            else if (i%5==0)
            {
                System.out.printf("Value %d:", i);
                System.out.print("Buzz");
                System.out.println();
            }
           else
            {
                System.out.println(i);
            }
        }

    }
}
