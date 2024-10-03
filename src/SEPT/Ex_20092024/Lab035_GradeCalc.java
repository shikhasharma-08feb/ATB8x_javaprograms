package SEPT.Ex_20092024;

public class Lab035_GradeCalc {
    public static void main(String[] args) {
        int score = 906;
        char grade;
        if (score>=90 && score<=100)
            grade='A';
        else if (score>=80 && score<90)
            grade='B';
        else if (score>=70 && score<80)
            grade='C';
        else if (score>=60 && score<70)
            grade='D';
        else if (score<0 || score>100){
            System.out.println("You are not genius");
            grade='O';}
        else {
            grade ='F';
        }
        System.out.println(grade);
    }
}
