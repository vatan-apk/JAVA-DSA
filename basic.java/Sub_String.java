import java.util.Scanner;
public class Sub_String {
    public static void main(String[] args) {
        String domain; //= "hello@gmail.com";
        String username;//=email.substring(0,5);
        // String domain = email.substring(6, 15);
        // System.out.println(username);
        // System.out.println(domain);

        // or //
        Scanner in = new Scanner(System.in);
        String email = in.nextLine();
        if(email.contains("@")){
            username= email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);
            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");
        }
    }
}
