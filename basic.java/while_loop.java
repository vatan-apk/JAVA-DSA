import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String response="";
// String name = "";
// while(name.isEmpty()){
// System.out.println("enter your name : ");
// name = in.nextLine();
// }
// System.out.println("Hello "+name);
while(!response.equals("Q")){
    System.out.println("You are playing a game");
    System.out.println("press Q to quit : ");
    response =in.next().toUpperCase();
}
System.out.println("game quited!!");
    }
}
