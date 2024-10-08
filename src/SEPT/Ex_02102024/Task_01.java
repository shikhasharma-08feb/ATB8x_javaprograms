package SEPT.Ex_02102024;

import javax.naming.Name;

public class Task_01 {
    public static void main(String[] args) {
       // Write 5 points related to the Class and Objects.
        System.out.println("5 points related to the Class and Objects");
        System.out.println("1.classes and objects are basic concepts of Object Oriented Programming (OOPs) that are used to represent real-world concepts " +
                "and entities");
        System.out.println("2.Class is user-defined blueprint or prototype from which objects are created.");
        System.out.println("3.There are two types of classes available in java a-Inbuilt or Predefined (e.g. Scanner , System Etc) b-User defined");
        System.out.println("4.Class is used to create the attributes and behaviours where attribute is Instance or varibale and behaviour is methods or " +
                "member functions");
        System.out.println("5.The class represents a group of objects having similar properties and behavior. For example, the animal type Dog is a class while a " +
                "particular dog named Tommy is an object of the Dog class.");
        System.out.println("________________________________________________________________________________________________________________________");
        //OOPs and Features.
        System.out.println("OOPs and Features.");
        System.out.println("OOPs stand for Object Oriented Programing lanaguage where program is devided into classes and Objects and can be understood as the " +
                "real world problem sloving concept and due to which its easy to understand java with OOPs concepts");
        System.out.println("Class and Object");
        System.out.println("Encapsulation");
        System.out.println("Polymoprhism");
        System.out.println("Abstraction");
        System.out.println("Inheritance");

        System.out.println("________________________________________________________________________________________________________________________");

        System.out.println("Create a Class  ATBStudent and 5 Objects - (A/");
        Shikha S1= new Shikha();
        S1.Name="SHIKHA SHARMA";
        S1.age=27;
        S1.color="Fair";
        S1.height=5.3F;
        S1.Company_Name="Accenture";
        System.out.println(S1.Name);
        System.out.println(S1.age);
        System.out.println(S1.color);
        System.out.println(S1.height);
        System.out.println(S1.Company_Name);


    }
}
