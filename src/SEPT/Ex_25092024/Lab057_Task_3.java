package SEPT.Ex_25092024;

public class Lab057_Task_3 {
    public static void main(String[] args) {
       /* Prime Number from 1 to 100. (for loop)*/
        int num=100;
        for (int i = 2; i <=num/2 ; i++) {
            if (num%i==0)
            {
                System.out.println(num);
            }

        }
    }
}
