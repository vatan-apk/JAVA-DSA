package searching;

import java.util.Arrays;
public class Sear2Darray {
    public static void main(String[] args) {
        int[][] arr1={
        {1,2,3,13,15},
        {4,5,6},
        {7,8}
    }; 
int key = 15;
int ans= fun(arr1,key);
if(ans==-1){
    System.out.println("element not found");
}else{
    System.out.println(ans+" is present in the list");
}

    }
    static int fun(int[][] arr,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==key){
                return arr[i][j];
                }
            }
        }
        return -1; 

    }
}
