public class LeetRich {
    public static void main(String[] args) {
        int[][] account ={
            {1,2,3},
            {3,2,1},
            {4,5,6}
        };
        System.out.println(fun(account)+" rich!!!");
    }
    static int fun(int[][] arr  ){
        int max=0;
    for(int i=0;i<arr.length;i++ ){
    if(add(arr[i])>max){
        max=add(arr[i]);
    }       

    }
    return max;
    }
    static int add(int[] a){
        int n=0;
        for(int i=0;i<a.length;i++){
        n=n+a[i];
        }
        return n;
    }
    
}
