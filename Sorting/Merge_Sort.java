import  java.util.*;

public static void merge(int[] arr,int low,int mid,int high){
    int left = low;
    int right = mid+1;
  List<Integer> list = new ArrayList<>();
    while(left<= mid && right <= high){
if(arr[left]<=arr[right]){
        list.add(arr[left]);
        left++;
    }else{
        list.add(arr[right]);
        right++;
    }
    }
    while(left<=mid){
                list.add(arr[left]);
        left++;
    }
    while(right<= high){
                list.add(arr[right]);

right++;
    }
    
    for(int i=low;i<=high;i++){
        arr[i]= list.get(i-low);
    }
}

public static void fun(int arr[], int low, int high){
if(low>=high){
    return ;
}
int mid=(low+high)/2;
fun(arr,low,mid);
fun(arr,mid+1,high);
merge(arr,low,mid,high);

}

public static void main(String[] args) {
    int[] arr= {2,4,5,1,2,6,5};
    fun(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
}