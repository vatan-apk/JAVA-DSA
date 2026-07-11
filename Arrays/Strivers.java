import java.util.*;

public static int secondLargest(int[] arr,int n){
int largest = arr[n-1];
int second=0;
for(int i=n-2;i>=0;i--){
    if(largest!=arr[i]){
        second = arr[i];
    break;
    }
}
return second;
}
public static int secondSmallest(int[] arr,int n){
    int smallest = arr[0];
    int second = 0;
    for(int i=1;i<n;i++){
        if(smallest!=arr[i]){
            second = arr[i];
            break;
        }
    }
    return second;
}

public static void print(int[] arr,int n){
   System.out.println(secondLargest(arr, n)); 
    System.out.println(secondSmallest(arr, n));
}

public static int[] dublicate(int[] arr,int n){
int  i=0;
for(int j=1;j<n;j++){
if(arr[j]!=arr[i]){
    arr[i+1]=arr[j];
    i++;
}
}
return Arrays.copyOf(arr,i+1);
}

// rotating arrayy by one places
public static int[] fun1(int[] arr,int n){
int temp=arr[0];
for(int i=1;i<n;i++){
arr[i-1]=arr[i];
}
arr[n-1]=temp;
return arr;
}
//Reverse function
public static void fun2(int[] arr,int start,int end){
    while (start < end) { 
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}
// Rotate array by k places
public static void Rotate(int arr[],int n,int k){
    k=k%n;
    fun2(arr,0, n-k-1);
    fun2(arr, n-k, n-1);
    fun2(arr, 0, n-1);
}

// place all zero at last by extra array o(n)
public static int[] lastZero(int[] arr){
int[] temp = new int[arr.length];
int j=0;
for(int i=0;i<arr.length;i++){
if(arr[i]!=0){
    temp[j]=arr[i];
    j++;
}
}
return temp;
}
// place all zeros at last o(1)
public static void lastZeros(int[] arr){
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j++;
        }
    }
}

// Union of two array

public static int[] MergeArray(int[] arr1,int[] arr2){
    int[] result = new int[arr1.length+arr2.length];
    System.arraycopy(arr1, 0, result, 0, arr1.length);
    System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
    Arrays.sort(result);
    return result;
}

public static int[] Common(int[] arr){
    int i=0;
    for(int j=1;j<arr.length;j++){
        if(arr[i]!=arr[j]){
            arr[i+1]=arr[j];
            i++;
        }
    }
    return Arrays.copyOf(arr,i+1);
}

//intersection of elements

public static ArrayList<Integer> intersection(int[] arr1,int[] arr2){
    int j=0;
    int i=0;
    ArrayList<Integer> list = new ArrayList<>();
    while(i<arr1.length && j<arr2.length ){
        if(arr1[i]<arr2[j]){
            i++;
        }else if(arr2[j]<arr1[i]){
           j++;
        }else{
            list.add(arr1[i]);
            i++;
            j++;
        }
    }
    return list;
}


//Max sub array (Brute force)
public static int MaxArray(int[] arr){
int max= Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
        int sum=0;
    for(int j=i;j<arr.length;j++){
        sum+=arr[j];
        max = Math.max(sum,max);
    }
}
return max;
}

//optimal approach Max subArray 
public static void MaxArray2(int[] arr){
    int sum=0;
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        max=Math.max(max,sum);
        if(sum<0){
            sum=0;
        }
    }
    System.out.print(max);
}

public static void main(String args[]){
int arr[] = {1,3,-4,5,-1,9};
MaxArray2(arr);
}