package basic_java;

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
    //    String[] fruits ={"apple","orange","banana","coconut"};
    //    Arrays.sort(fruits);
    //   for(String fruit : fruits){
    //    System.out.println(fruit);
     
    // }
    Scanner in = new Scanner(System.in);
String[] foods;
int size;
size = in.nextInt();
in.nextLine();
foods = new String[size];
for(int i=0;i<foods.length;i++){
    System.out.println("enter a food : ");
    foods[i]=in.nextLine();
}
for(String food : foods){
    System.out.println(food);
}

    }
}
