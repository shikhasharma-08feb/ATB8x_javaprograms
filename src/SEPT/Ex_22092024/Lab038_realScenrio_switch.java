package SEPT.Ex_22092024;

public class Lab038_realScenrio_switch {
    public static void main(String[] args) {
        String browser="Chrome";
        switch (browser)
        {
            case "Chrome":
                System.out.println("Execute all Chrome Related TCs");
                break;
            case "Firefor":
                System.out.println("Execute all Firefox Related TCs");
                break;
            case "Edge":
                System.out.println("Execute all Edge Relted Tcs");
                break;
            default:
                System.out.println("No idae");
        }
        System.out.println("End");
    }
}
