// factorial
public static int fun1(int n){
if(n==0){
    return 1;
}
return n*fun1(n-1);
}
// reverse an array
public static void fun2(int[] arr,int i,int j){
if(i>=j){
    for(int k=0;k<arr.length;k++){
System.out.print(arr[k]); 
    }
return;
}
int temp = arr[i];
arr[i]=arr[j];
arr[j]= temp;

fun2(arr, i+1, j-1);

}

// palendrome normal function

public static boolean fun3(int numb){
int sum=0;
int Old = numb;
while (numb>0) { 
    int lastdigit = numb%10;
    sum = sum*10 + lastdigit;
    numb /=10;
}
return sum==Old;
}
// pallendrome recurtion function

public static boolean fun3i(int i,String str){
if(i>=str.length()/2){
    return true;
}
if(str.charAt(i)!=str.charAt(str.length()-i-1)){
    return false;
}
return fun3i(i+1,str);
}

  

public static void main(String[] args){
    String str="madam";
System.out.print(fun3i(0,str));
}