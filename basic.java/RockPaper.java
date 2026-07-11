import java.util.Random;
import java.util.Scanner;
public class RockPaper {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
Random rand = new Random();
String[] choice = {"rock","paper","scissors"};
String playerChoice;
String computerChoice;
String playAgain;
do{
System.out.print("Enter your move (rock,paper,scissors): ");
playerChoice =  in.nextLine().toLowerCase();
if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors") ) {
    System.out.println("Invalid Choice");
    
}
computerChoice = choice[rand.nextInt(3)];
System.out.println("Computer choice: " +computerChoice);
if(playerChoice.equals(computerChoice)){  
System.out.println("Its a tie !");

}else if(playerChoice.equals("rock") && computerChoice.equals("scissors")){
    System.out.println("You win !");
}else if(playerChoice.equals("paper") && computerChoice.equals("rock")){
    System.out.println("You win !");
}else if(playerChoice.equals("scissors") && computerChoice.equals("paper")){
System.out.println("You win !");
}
else{
    System.out.println("You lose!");
}
System.out.println("play again (yes/no) :");
playAgain = in.nextLine().toLowerCase();
}while(playAgain.equals("yes"));
          System.out.println("THANK YOU FOR PLAYING !");
    }
}
