package arrays;

public class Kadanes_algo {
    public static void main(String[] args) {
      int nums[]={-2,-3,4,-1,-2,1,5,-3};
        fun(nums);
    }
    public static void fun(int[] nums){
          int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum = currSum+nums[i];
            if(currSum<0){
                currSum=0; 
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("Our max Subarray sum is : "+maxSum);
    }
}
