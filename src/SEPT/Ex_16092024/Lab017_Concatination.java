package SEPT.Ex_16092024;

public class Lab017_Concatination {
    public static void main(String[] args) {
        String a="shikha";
        String b="Sharma";
        int c=10;
        int d=12;
        System.out.println(a+b); //Concatination operator
        //+- with int do maths
        //+- with string do conactination
        System.out.println(a+b+c+d); //here it will show value as string is doing concat first
        System.out.println(c+d+a+b); // here it will add as first we have add or mathemetcal operation

    }
}
