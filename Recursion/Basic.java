public class Basic{
  
    // print decending order of 1 to n numbers
    public static void fun(int a){
    if(a==1){
        System.out.println(a);
return;
    }
    System.out.print(a+" ");
    fun(a-1);
    }
    //print accending order of 1 to n numbers
    public static void fun2(int a){
if(a==1){
    System.out.print(a+" ");
    return;
}
fun2(a-1);
System.out.print(a+" ");
    }
    // Factorial of the number
public static int fact(int n){
if(n==0){
 return 1;
}
int mul = fact(n-1);
int fn= n * fact(n-1);
return fn;
}
// sum of n numbers
public static int sumofn(int n){
    if( n==0){
       return 0;
    }
    int add = sumofn(n-1);
    int fu = n + sumofn(n-1);
    return fu;
}

// array sorted or not to check

public static boolean sorted(int[] arr,int i){
    if(i==arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
       return false; 
    }
    return sorted(arr,i+1);
}
// finding key value;
public static void target(int[] arr,int i,int target){
if(i==arr.length-1){
    System.out.println("Target not exists");
}
if(arr[i]==target){
    System.out.println("Target found at index "+i);
    return;
}
target(arr,i+1,target);
}
//we have to find the target piche se
public static int lastOccurence(int[] arr,int  key, int i){
if(i == arr.length){
    return -1;
}
int isFound=lastOccurence(arr, key, i+1);
if(isFound != -1){
    return isFound;
}
if(arr[i]==key){
    return i;
}
return isFound;
}

// x^n calculation
public static int xpowrn(int x , int n){

if(n==0){
    return 1;
}

return  x* xpowrn(x,n-1);
}

// x^n in optimised way

public static int optimisedPower(int a , int n){
    if(n==0){
        return 1;
    }
    int half = optimisedPower(a, n/2);
    int halfpowerSq = half * half ;
    if(n%2!=0){
        halfpowerSq = a* halfpowerSq;
    }
    return halfpowerSq;
}
  public static void main(String[] args) {

System.out.print(optimisedPower(2, 3));
    }
} 