import java.util.Arrays;
public class AgnosticBinary {
    public static void main(String[] args) {
        int[] arr={12,23,34,45,56,67,78,89};
        System.out.println(fun(arr,45)+" element present in the list!!!"); 
    }
    static int fun(int[] arr,int target){
int front=0;
int last=arr.length-1;
boolean aso = arr[front]<arr[last];
while(front<=last){
//for(int i=0;i<arr.length;i++){   
    int mid=(front+last)/2;  
    if(arr[mid]==target){
        return arr[mid];
    }
    if(aso){//ascending order
        if(target<arr[mid]){
            last=mid-1;
        }else{
            front=mid+1;
        }
    }else{//decending order
if(target>arr[mid]){
    last=mid-1;
}else{
        front=mid+1;

}
    }
}
return -1;

}
}
