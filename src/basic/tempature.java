package basic;

import java.util.Scanner;

public class tempature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your celceus value :");
        float celceus = input.nextFloat();
        float Farenhiet= (celceus*9/5)+32;
        System.out.println(Farenhiet);

    }
    
}
