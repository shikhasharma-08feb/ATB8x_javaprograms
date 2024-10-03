package SEPT.Ex_27092024;

public class Lab059_FIZZ_BUZZ_Task {
    public static void main(String[] args) {
        /* Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number,
        and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."*/
       int i=1;
       do {

                  if(i%3==0 && i%5==0)
               {
                   System.out.println("FIZZBUZZ"+i);
               }
                  else if (i%3==0)
                  {
                     System.out.println("FIZZ"+i);
                  }
                  else if (i%5==0)
                  {
                      System.out.println("BUZZ"+i);
                  }
                  else {
                      System.out.println(i);
                  }
           i++;
       }while(i<=100);
              }
    }

