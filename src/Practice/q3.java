package practice;

import java.util.*;
public class q3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter size of your Element : ");
int a =in.nextInt();
int[] arr=new int[a];
System.out.println("Enter Elements of array : ");
for(int i=0;i<arr.length;i++){
    arr[i]=in.nextInt();
}
fun(arr,7);
    }
    public static void fun(int[] arr,int key){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
               flag= true;
               break;
            }
        }
        if(flag){
            System.out.println("Key value found ");
        }else{
            System.out.println("Not found !");
        }
    }
}
