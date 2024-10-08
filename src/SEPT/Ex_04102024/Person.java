package SEPT.Ex_04102024;

public class Person {

       String name1;
       String gender;
       int age;
       float height;
       char Bloodgroup;
       String color;
       String Com_Name;
       int Year_Exp;
       Boolean martial_Status;
       Boolean WorkingStatus;

// Default Constructor
    Person()
    {
        System.out.println("Default Constructor");
    }
    Person(String name1)
    {
        this.name1=name1;
    }
    Person(String gender, int age , float height, char Bloodgroup)
    {
        this.gender=gender;
        this.age=age;
        this.height=height;
        this.Bloodgroup=Bloodgroup;
    }
    Person(String color, String Com_Name , int Year_Exp,boolean martial_Status)
    {
        this.color=color;
        this.Com_Name=Com_Name;
        this.Year_Exp=Year_Exp;
        this.martial_Status=martial_Status;


    }
    Person(boolean WorkingStatus)
    {
        this.WorkingStatus=WorkingStatus;
    }

     void function1()
    {
        System.out.println("NRNA");

    }

    String function2()
    {
        System.out.println("WRNA");
        return "HELLO";
    }

    void function3(String name1)
    {
        System.out.println("NRWA");
        System.out.println("Name shared" +name1);
    }

    int function4(int age)
    {
        System.out.println("WRWA");
        return 12;
    }
}

