package arrays;

public class Subarrays {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        fun(num);
    }
    public static void fun(int[] num){
for(int i=0;i<num.length;i++){
int start = i;
for(int j=i;j<num.length;j++){
    int end = j;
            int sum=0;

    for(int k=start;k<=end;k++){
        sum=sum+num[k];
System.out.print(num[k]+" ");
    }
    System.out.println(" -> SUM = "+sum);
}
System.out.println();
}
    }

}
