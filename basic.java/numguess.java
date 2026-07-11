import java.util.Random;
import java.util.Scanner;

public class numguess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int attempts=0;
int randomNum = random.nextInt(1,11);
System.out.println("number guessing game: ");
System.out.println("Guess a number between 1-10 : ");
do{
    System.out.println("Enter a guess: ");
    guess = in.nextInt();
    attempts++;

if(guess<randomNum){
    System.out.println("ToO LOW !!");
}else if(guess>randomNum){
System.out.println("TOO LARGE !!");
}else{
    System.out.println("# of attempts "+attempts);
}
}
while(guess != randomNum); 
    
}
}
