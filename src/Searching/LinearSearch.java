package searching;

import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
      int[] nums ={23,34,45,13,54,65,76};
      int key = 54;
      int ans = fun(nums,key);
      System.out.println(ans+" IS FOUND / PRESENT IN THE LIST");

}
 static int fun(int[] arr , int key){
    if(arr.length==0){
        return -1;
    } 
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){ 
            return arr[i];
        }
    }
    return -1;
 }
}