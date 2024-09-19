package SEPT.Ex_18092024;

public class Lab0027_Task_Type_Casting_narrowing {
    public static void main(String[] args) {
    //widening
        byte a=101;
        short b=1023;
        long c=13131313l;
        long d=a+b+c; //Implicit widening
        long d1=(long) ((long)a+b+c); //Explicit widening
        System.out.println("Widening");
        System.out.println(d);

    //Narrowing
    byte a1=101;
    char b1='A';
    long c1=9410867564l;

    byte d2= (byte) ((byte) a1+b1+c1); //Explicit narrwoing
        //byte d3= a1+b1+c1; // Implicit narroqing not valid
        System.out.println("Narrwing");
        System.out.println(d2);

    }
}
