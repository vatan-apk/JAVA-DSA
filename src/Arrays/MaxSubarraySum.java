package arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] num= {1,2,3,4,5};
        fun(num);
    }
    public static void fun(int[] num){
int maxSum=Integer.MIN_VALUE;
int prefix[]=new int[num.length];
prefix[0]=num[0];
for(int i=1;i<prefix.length;i++){
    prefix[i]=prefix[i-1]+num[i];
}

    for(int i=0;i<num.length;i++){
        for(int j=i;j<num.length;j++){
            int sum=0;
           sum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
            System.out.print(" "+sum);
            if(sum>maxSum){
                maxSum=sum;
            }
        }
    }
    System.out.println(" Max sum = "+maxSum);
    }
}
