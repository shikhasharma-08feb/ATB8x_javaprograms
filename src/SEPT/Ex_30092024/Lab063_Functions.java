package SEPT.Ex_30092024;

public class Lab063_Functions {
    public static void main(String[] args) {
       function1();
      String name=function2();
        System.out.println(name);
      function3("SHikha Sharma");
      int age=function4(67);
        System.out.println(age);

    }
    public static void function1()
    {
        System.out.println("1.Without Parameters and Without Return Type");
    }
    public static String function2()
    {
        System.out.println("2.Without Parameters but With Return Type");
        return "Shikha";
    }
    public static void function3(String name1)
    {
        System.out.println("3.With Parameters and Without Return Type");
        System.out.println("Name1 is" +name1);
    }
    public static int function4(int age)
    {
        System.out.println("3.With Parameters and with Return Type");
        return age;
    }
}
