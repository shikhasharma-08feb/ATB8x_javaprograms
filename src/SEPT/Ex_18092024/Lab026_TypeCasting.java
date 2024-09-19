package SEPT.Ex_18092024;

public class Lab026_TypeCasting {

         public static void main(String[] args) {
            //Typecasting
            //widening & narrowing

            //widening - larger container or data type is used to store the sammler value (Lossless)
            // Implicit - byte a=10, int b=10; byte c=a+b
            // Expilicit byte c=int a+b;
            byte a=10;
            byte b=10;
            int c=a+b; //Implicit widening
            //int c=(byte) a+b;//Explicit widening
            System.out.println(c); //

            //narrowing - Smaller datatype is used to contain the larger operands values (withloss)
            //Implicit - Not allow
            //Explicit - allowed

            float a1=10.67f;
            long l=1000l;
            //long c1=a1+l; //invalid
            float c2=a1+l; //wideing
            long c1=(long) a1+l;
            System.out.println(c1);

            int val=300;
            byte b1= (byte) val;
             System.out.println(b1);

             //Example of Mobile number
             long Mob_No=9410867546l;
             short s= (short) Mob_No;
             System.out.println(s);

             //Gst Example
             //Total Gst=18.45;
             int course_fee=1000;
             float gst=18.45f;
             int total_fee= (int) (course_fee+gst);
             System.out.println("total fees="+total_fee);



        }

    }

