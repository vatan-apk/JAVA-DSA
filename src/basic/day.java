package basic;

import java.util.Scanner;

public class day {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
            System.out.println("TUESDAY");
            break;
            case 3:
            System.out.println("WEDNESDAY");
            break;
            case 4:
            System.out.println("THURSDAY");
            break;
             case 5:
            System.out.println("FRIDAY");
            break;
             case 6:
            System.out.println("SATURDAY");
            break;
             case 7:
            System.out.println("SUNDAY");
            break;

        
            default:
            System.out.println("MAT KAR BHAI BAKCHODI");
                break;
        }
    }
}
