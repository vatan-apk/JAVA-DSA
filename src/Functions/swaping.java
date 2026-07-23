package functions;

//import java.util.Scanner;
public class swaping {
    public static void main(String[] args) {
         swap(20,30);

        //System.out.println(swap);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        
    }
}
