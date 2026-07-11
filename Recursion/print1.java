
public static void fun1(){
    System.out.println("1");
    fun1();
}
// reverse number printing
 static  int  count=3;
public static void fun2(int n){
    if(n<0){
        return;
    }
            System.out.println(n);
            fun2(n-1);
    }
 //print name n times
public static void fun3(int i,int n){
if(i>n){
    return;
}
System.out.println("vatan");
fun3(i+1,n);
} 
// 1 to n printing
public static void fun4(int n){
if(n==6){
    return;
}
System.out.println(n);
fun4(n+1);
}
public static void fun41(int i, int n){
if(n==i){
    return;
}
System.out.println(i);
fun41(i+1, n);
}

// 1 to n using backtracking
public static void fun5(int i, int n){
if(i<1){
    return;
}
fun5(i-1,n);
System.out.println(i);

}

// reverse 1 to n using backtracking
public static void fun51(int i,int n){
if(i>n){
    return;
}
fun51(i+1, n);
System.out.println(i);
}

//sum of n numbers
public static void sum(int i,int n){
    if(i<1){
                    System.out.println(n);
        return;
    }
    sum(i-1, n+i);
}
public static void main(String args[]){
sum(3,0);
}
