package SEPT.Ex_20092024;

public class Lab031_TAsk2 {
    public static void main(String[] args) {

        int score = 85;
        char A, B, C;
        String grade = (score>=90) ? "A" : (score>=80 && score<=89) ? "B" : (score>=50 && score<=79) ? "C" : "FAIL";

        System.out.println("grade = " +grade);
    }


}
