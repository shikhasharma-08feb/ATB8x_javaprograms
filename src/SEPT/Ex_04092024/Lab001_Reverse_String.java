package SEPT.Ex_04092024;

import java.util.Scanner;

public class Lab001_Reverse_String {
    public static void main(String args[])
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String");
        s = sc.nextLine();
        System.out.print("Reverse String=");
        for (int i=s.length(); i>0;--i)
        {
            System.out.print(s.charAt(i-1));
        }
    }
}
