package SEPT.Ex_18092024;

public class Lab028_Increment_decrement_operator {
    public static void main(String[] args) {
         /* int a = 10;
System.out.println(  --a + a --  + a-); System.out.println(a);

    int a = 10;
System.out.println(  --a + a++ + a-); System.out.println(a);

    int a = 10;
System.out.println(  a- - + a --  + a --); System.out.println(a);*/
int a=10;
       /* int a=10;
        System.out.println(  --a + a --  + a--); //(9+9+8) // 26
        System.out.println(a); //7
        //line no | Exp | val a
        //14      | NA  | 10
        //15      |     |   9+9+8
        //16      |     |   7*/
        //System.out.println(  --a + a++ + a--); // 9+9+10=28
        //System.out.println(a);//9
        //line no | Exp | val a
        //14      | NA  | 10
        //21      |     |   9+9+10 =28
        //22      |     |   9*/
        System.out.println(  a-- + a --  + a --); //10+9+8 -- 27
        System.out.println(a); //7


    }


}
