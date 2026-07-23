package searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        
    
    int[] arr={1,23,45,678,980,1234};
    int ans = fun(arr,678);
    System.out.println(ans+" is present in the list");
    }
    static int fun(int[] arr,int key){
        int front=0;
        int last=arr.length-1;
        while(front<=last){
            int mid= (front+last)/2;
            if(arr[mid]==key){
        return arr[mid];
       }
       else if(key>arr[mid]){ 
       // mid=front+1;
       front = mid+1;
       }                       
       else{
      //  mid=last-1;
      last= mid-1;
       }
    }
return -1;
}
}
