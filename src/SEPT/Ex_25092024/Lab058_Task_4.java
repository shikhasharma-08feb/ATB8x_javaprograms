package SEPT.Ex_25092024;

import java.util.Scanner;

public class Lab058_Task_4 {
    public static void main(String[] args) {
/*        Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4*/
        int count1=0;
        int count2=0;
        String Name;
        System.out.println("Enter the String:-");
        Scanner sc=new Scanner(System.in);
        Name=sc.nextLine();
        for(int i = 0; i < Name.length(); i++)
        {
            if (Name.charAt(i)=='a' || Name.charAt(i)=='e' || Name.charAt(i)=='i' || Name.charAt(i)=='o' || Name.charAt(i)=='u' ||Name.charAt(i)=='A' ||
                    Name.charAt(i)=='E' || Name.charAt(i)=='I' || Name.charAt(i)=='O' || Name.charAt(i)=='U')
            {
                count1++;

            }
            else
            {
                count2++;

            }


        }
        System.out.println("Conunt of Vowel is-"+count1);
        System.out.println("Conunt of Consonant is-"+count2);

    }
}
