import java.util.Random;
import java.util.Scanner;
public class dice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
Random rand=new Random();

int numofDice;
int total=0;
System.out.println("enter the # of dice to roll: ");
numofDice = in.nextInt();
if(numofDice>0){
    for(int i=0;i<numofDice;i++ ){
        int roll= rand.nextInt(1,7);
        fun(roll);
        System.out.println("You rolled: "+roll);
total += roll;
    }
}else{
    System.out.println("# of dice must be greater than 0");
}

    }
    static void fun(int roll){
        String dice1="""
                --------
                |      |
                |  1   |
                |      |
                --------
                """;
              String dice2="""
                --------
                |      |
                |  2   |
                |      |
                --------
                """;    
                  String dice3="""
                --------
                |      |
                |  3   |
                |      |
                --------
                """;
                  String dice4="""
                --------
                |      |
                |  4   |
                |      |
                --------
                """;
                  String dice5="""
                --------
                |      |
                |  5   |
                |      |
                --------
                """;
                  String dice6="""
                --------
                |      |
                |  6   |
                |      |
                --------
                """;
                switch(roll){
                    case 1->System.out.print(dice1);
                    case 2->System.out.print(dice2);
                    case 3->System.out.print(dice3);
                    case 4->System.out.print(dice4);
                    case 5->System.out.print(dice5);
                    case 6->System.out.print(dice6);
default -> System.out.println("default");
                }
    }
}