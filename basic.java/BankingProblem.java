import java.util.Scanner;

public class BankingProblem {
     static   Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double balence=99.09 ;
        int types;
        double deposit;
        double withdrawn;
        boolean close = true;
        while(close){
    System.out.println("Enter the case 1-4");
    types = in .nextInt();
    switch (types) {
        case 1 -> showBalence(balence);
            
        case 2-> balence+=deposit();
        case 3-> balence-=withdrawn(balence);
        case 4-> close=false;
        default-> System.out.println("Invalid number !");

    }
}
    }
    static void showBalence(double balence){
        System.out.println("your bank balence is :$"+balence);
    }
    static double deposit(){
    double amount;
    System.out.println("Enter an amount to be deposited : ");
    amount = in.nextDouble();
    if(amount<0){
        System.out.println("Amount cant be negative");
        return 0;
    }else{
        return amount;
    }
    
    }
    static double withdrawn(double balence){
 double amount;
 System.out.println("Enter you withdrawn amount : ");
 amount = in.nextInt();
 if(amount>balence){
    System.out.println("Beta Aukaat me !");
    return 0;
 }
 else if(amount<=0){
    System.out.println("GAREEB!!");
    return 0;
 }else{
    return amount;
 }
    }
}
