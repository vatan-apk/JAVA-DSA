package practice;

public class ques4 {
    public static void main(String[] args) {
    int[] arr ={1,2,3,4,566,7};
    int ans = fun(arr,6);
    System.out.println(" "+ans);
    }
    public static int fun(int[] arr,int key){
        int first =0;
        int last = arr.length;
        while (last>=first) { 
            int mid = (first+last)/2;
            if(arr[mid]==key){
                return arr[mid];
            }else if (arr[mid]>key) {
                last = mid -1;
            }else{
                first = mid +1;
            }
        }
        return -1;
    }
}
