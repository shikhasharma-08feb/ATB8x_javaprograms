package SEPT.Ex_25092024;

public class Lab057_Task_3 {
    public static void main(String[] args) {
       /* Prime Number from 1 to 100. (for loop)*/
        /*int num=97;
        int f=0;

        for (int i=2; i<=num/2; i++) {
            if (num%i==0)
            {
               f=1;
               break;
            }
        }
        if(f==1)
        {
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime No" +num);
        }*/

        {
            int i =0;
            int num =0;
            //Empty String
            String  primeNumbers = "";

            for (i = 1; i <= 100; i++)
            {
                int counter=0;
                for(num =i; num>=1; num--)
                {
                    if(i%num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    //Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Prime numbers from 1 to 100 are :");
            System.out.println(primeNumbers);
        }
    }
    }
