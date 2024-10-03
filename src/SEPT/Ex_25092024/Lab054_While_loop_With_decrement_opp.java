package SEPT.Ex_25092024;

import java.util.Scanner;

public class Lab054_While_loop_With_decrement_opp {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        while(i>=0)
        {
            System.out.println(i);
            --i;
        }
    }
}
