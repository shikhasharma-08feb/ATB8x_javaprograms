package SEPT.Ex_13092024;

public class Lab012_Literals {

    public static void main(String[] args) {
        System.out.println("Literals");
        //Boolean type that can store only true or false
        boolean is_married=true;
        //integer type decimal system
        int age=78;
        //Integral literals
        //binary literal
        int binary_num=0b101001010;
        System.out.println(binary_num);
        // hexa litra;
        int hex1=0xface;
        System.out.println(hex1);
        int hex2= 0x28a745;
        System.out.println(hex2);
        //octal literal,
        int octal=0101;
        System.out.println(octal);
        //char literals
        char newline='\n';
        char tab='\t';
        char backspace='\b';
        char car_r='\r';
        System.out.println("Shikha"+newline+"Sharma"+tab+"working in " +
                "accenture"+backspace+"from 2023 November in Energy domain project");
        System.out.println("Hello my name is shikha"+car_r+"sharma");
        char c1='\u1F60' ;//unicode smiley
        System.out.println(c1);
        String s6=null;
        System.out.println(s6);
    }
}
