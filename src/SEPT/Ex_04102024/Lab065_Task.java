package SEPT.Ex_04102024;

public class Lab065_Task {
    public static void main(String[] args) {
        //Create a Person Class with 10 A, 5 Behavr( All types of Methods) and use the DC and PC to set the values, Create 5 Objects

    Person p1=new Person();
    Person p2=new Person("Shikha");
    Person p3 = new Person("Female", 57, 6.8f,  'N');
    Person p4=new Person("Fair", "ACC" , 5,true );
    Person p5=new Person(false);

        System.out.println(p1.name1);
        System.out.println(p2.name1);
        System.out.println(p3.name1);
        System.out.println(p3.gender);



    }
}
