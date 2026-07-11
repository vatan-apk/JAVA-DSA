import java.util.Scanner;
public class cases {
    public static void main(StringArray[] args) {
        Scanner in = new Scanner(System.in);
        StringArray fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("KING OF FRUITS");
                break;
            case "Apple":
            System.out.println("KEEPS DOCTOR AWAY");
            break;
            case "cane":
            System.out.println("GANNE KA JUICE BADA GLASS");
            break;
            case "bananna":
            System.out.println("DEHHER SARE CARBS ");
                break;
        
            default:
            System.out.println("Ye kaya ho raha hai bhai");
                break;
        }
    }

}
