package SEPT.Ex_25092024;

public class Lab052_conti {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            System.out.println(i);
            if (i==7)
            {
                continue;
            }
            System.out.println("after");
        }
    }
}
