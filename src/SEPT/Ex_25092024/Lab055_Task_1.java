package SEPT.Ex_25092024;

import java.util.Scanner;

public class Lab055_Task_1 {
    public static void main(String[] args) {
      /*  //Table of number n = 10, print table with For or while.
        int n=10;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i*n);
        }*/

        int n;
        System.out.println("Enter Value of N--");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();

        int i=1;
        while(i<=10)
        {
            System.out.println(i*n);
            i++;
        }
    }
}
