package SEPT.Ex_25092024;

public class Lab056_Task_2 {
    public static void main(String[] args) {
       /* Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120

        // n = 1 ->  Fact = 1*1 -> 1

        // n = 3 -> Fact = 3*2*1 -> 6 */
        int n=5;
        int f=1;
        for (int i=1;i<=n;i++)
            f=f*i;
            System.out.println(f);


    }
}
