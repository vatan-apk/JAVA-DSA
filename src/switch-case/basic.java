package switch_case;


import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit =in.next();
        // String a= "vatan";
        // String b="vatan";
        // System.out.println(a!=b);
        if(fruit.equals("mango")){
            System.out.println("KING OF FRUITS");
        }
        if(fruit.equals("apple")){
            System.out.println("A SWEET RED FRUIT ");
        }
    }
}
