package switch_case;

import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int employID = in.nextInt();
        String depart = in.next();
        switch (employID) {
            case 1:
                System.out.println("2345 ");
                break;
            case 2:
            System.out.println("1234");
            break;
            case 3:
            switch (depart) {
                case "IT":
                System.out.println("DATA ANALIST");
                    
                    break;
                case "management":
                System.out.println("ACOUNTANT ");
                 break;
                default:
                System.out.println("TIME PASS !!");
                    break;
            }
            break;
            default:
            System.out.println("enter the correct ID");

                break;
        }
    }
}
