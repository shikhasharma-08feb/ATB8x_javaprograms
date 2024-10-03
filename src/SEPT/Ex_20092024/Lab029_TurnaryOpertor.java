package SEPT.Ex_20092024;

import java.util.Scanner;

public class Lab029_TurnaryOpertor {
    public static void main(String[] args) {
    int a=10,b=20;
    int max= (a>b?a:b);
    System.out.println(max);
    boolean result =(a>b?true:false);
    System.out.println("a is greater than b=" +result);
    int min=(a<b?a:b);
    System.out.println(min);

    }
}

