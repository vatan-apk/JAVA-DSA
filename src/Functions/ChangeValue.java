package functions;

import java.util.Arrays;

public class ChangeValue {
   public static void main(String[] args) {
    //create an array
    int [] arra ={1,3,2,45,6};
    change(arra);
    System.out.println(Arrays.toString(arra));

   }
   static void change(int[] num){
    num[0]=69;
   } 
    
}
