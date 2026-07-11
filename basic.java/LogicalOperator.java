import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String username;
       System.out.println("enter your new username: ");
       username =in.nextLine();
       if(username.length()<4 || username.length()>12){
        System.out.println("It must be in between ");
       }else{
        System.out.println(username);
       }
    }
}
