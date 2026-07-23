package searching;

import java.util.Arrays;
public class LeetTwoSum  {
    public static void main(String[] args) {
        
    
  //  public int[] twoSum(int[] nums, int target) {
    int[] arr={1,2,3,4,5,6,7,8,9};
    int[] ans=fun(arr,3);
    System.out.print(Arrays.toString(ans));
    }

    static int[] fun(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target)
                return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}