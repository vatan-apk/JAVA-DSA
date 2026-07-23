package searching;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,1,2,3};
        int a= fun(arr);
        System.out.println(a);
    }
    // 2 3 4 5 1 2 3
    static int search(int[] arr,int key){
        int pivot = fun(arr);
        if(pivot==-1){
// Normal Binary search
return Binary(arr, key,0,arr.length-1);
        }
        if(arr[pivot]==key){
            return pivot; 
        }
if(key>=arr[0]){
    return Binary(arr, key,0,arr.length-1);
}
return Binary(arr,key,pivot+1,arr.length-1);
    }
    static int Binary(int[] arr,int key,int start,int last){
  
        while(start<=last){
            int mid=(start+last)/2;
            if(arr[mid]==key){ 
              return arr[mid];
            }else if(arr[mid]>=key){
                last=mid-1;
            }else{
                start=mid+1;
            }
        } 
        return -1;
    }
    static int fun(int[] arr){
    int front=0;
    int last = arr.length-1;
    while(front<=last) {
        int mid=(front+last)/2;
        if(mid<last && arr[mid]>arr[mid+1]){  
            return mid; 
        }if(mid>front && arr[mid]<arr[mid-1]){
            return mid-1; 
        }
        if(arr[mid]<=arr[front]){
            last=mid-1;
        }else{
            front=mid+1;
        }
        }
    
    return -1;
}
}
