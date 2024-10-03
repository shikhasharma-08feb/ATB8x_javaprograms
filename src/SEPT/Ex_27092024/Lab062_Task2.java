package SEPT.Ex_27092024;

public class Lab062_Task2 {
    //Create a Java program that prints the first 5 even numbers using a do-while loop.
    public static void main(String[] args) {
        int num=0;
        int count=0;
        do {
            System.out.println(num);
            num+=2;
            count++;
        }while(count<5);
    }
}
