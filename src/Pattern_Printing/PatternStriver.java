public static void fun(int n){ // Star triangle khada wala

for(int i=0;i<=n;i++){
    //space
    for(int j=0;j<=n-i-1;j++){
    System.out.print(" ");
    }//star 
    for(int k=0;k<=2*i+1;k++){
        System.out.print("*");
    }
    for(int l=0;l<=n-i-1;l++){
System.out.print(" ");
    }
System.out.println();
    
}
}
//output
//      **
//     ****
//    ******
//   ********
//  **********
// ************

public static void fun2(int n){ // ulta star triangle khada wala!

for(int i=0;i<=n;i++){
    //space
    for(int j=0;j<=i;j++){
    System.out.print(" ");
    }//star 
    for(int k=0;k<=2*n-(2*i+1);k++){
        System.out.print("*");
    }
    for(int l=0;l<=i;l++){
System.out.print(" ");
    }
System.out.println();
    
}
}

// output
//  **********
//   ********
//    ******
//     ****
//      **


public static void fun3(int n){
    for(int i=1;i<=2*n-1;i++){
    int start = i;                                 
    if(i>n){
        start= 2*n-i;
    }
    for(int j=1;j<=start;j++){
        System.out.print("*");
    }
    System.out.println("");
    }
}
//output
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public static void fun4(int n){
    int start=1;
for(int i=0;i<n;i++){
if(i%2==0){
    start=1;
}else{
    start=0;
}
    for(int j=0;j<=i;j++){
      System.out.print(start);
      start = 1-start;
    }
    System.out.println("");
}
}

public static void fun5(int n){
    for(int k=1;k<=n;k++){
for(int i=1;i<=k;i++){
    System.out.print(i);
}
for(int j=1;j<=2*n-(2*k+1);j++){
    System.out.print(" ");
}
for(int l=k;l>=1;l--){
    System.out.print(l);
}
System.out.println("");
    }

}
// output
// 1     1
// 12   21
// 123 321
// 12344321

public static void fun6(int n){
    int x=1;
for(int i=0;i<=n;i++){
    for(int j=0;j<=i;j++){
        System.out.print(x+" ");
        x++;
    }
    System.out.println("");
}
}
//output
// 1
// 2 3
// 4 5 6
// 11 12 13 14 15


public static void fun7(int n){
    char ch='A';
for(int i=0;i<=n;i++){
    for(int j=0;j<=i;j++){
    System.out.print(ch);
    ch++;
    }
System.out.println("");
}
}
//output
// A
// BC
// DEF
// GHIJ
// KLMNO


public static void fun8(int n){
for(int i=0;i<=n;i++){
    char ch='A';
    for(int j=0;j<=i;j++){
    System.out.print(ch);
    ch++;
    }
System.out.println("");
}
}
//output
// A
// AB
// ABC
// ABCD
// ABCDE



public static void fun9(int n){
    char ch='A';
for(int i=0;i<=n;i++){
    for(int j=0;j<=i;j++){
    System.out.print(ch);
    }
    ch++;
System.out.println("");
}
}
//output
// A
// BB
// CCC
// DDDD
// EEEEE

public static void fun10(int n){
for(int i=0;i<=n;i++){
    for(char j='A';j<='A'-i+n;j++){
        System.out.print(j);
    }
    System.out.println("");
}
}
//output
// ABCDE
// ABCD
// ABC
// AB
// A

public static void fun11(int n){
    for(int i=0;i<=n;i++){
        //space
        for(int j=0;j<=n-i-1;j++){
    System.out.print(" ");
    }
    //char
    char ch = 'A';
    int breakpoint= (2*i+1)/2;
   for(int k=0;k<=2*i-1;k++){
   System.out.print(ch);
   if(k<=breakpoint){
    ch++;
   }else{
    ch--;
   }
   }
    //space
    for(int j=0;j<=n-i-1;j++){
    System.out.print(" ");
    }
    System.out.println("");
    }
}

public static void fun12(int n){
for(int i=0;i<n;i++){
    for(char ch =(char)('E'-i);ch<='E';ch++){
        System.out.print(ch);
    }
System.out.println("");
}
}

public static void fun13(int n){
int init =1;
for(int i=0;i<=n;i++){
    for(int j=0;j<n-i;j++){
        System.out.print("*");
    }
    for(int k=0;k<=init;k++){
        System.out.print(" "); 
    }
    for(int l=0;l<n-i;l++){
        System.out.print("*");
    }
    init+=2;
    System.out.println("");
}
for(int i=0;i<=n;i++){
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    for(int k=0;k<=2*n-(2*i-1);k++){
        System.out.print(" ");
    }
    for(int l=0;l<i;l++){
        System.out.print("*");
    }
    System.out.println("");
}

}

//output 

// ****  ****
// ***    ***
// **      **
// *        *


// *        *
// **      **
// ***    ***
// ****  ****

public static void fun14(int n){
    int spaces = 2*n-2;
    for(int i=0;i<=2*n-1;i++){
        int start=i;
        if(i>n) start = 2*n-i;
//stars
for(int j=0;j<=start;j++){
System.out.print("*");
}
//spaces
for(int k=0;k<=spaces;k++){
    System.out.print(" ");
}
//star
for(int l=0;l<=start;l++){
    System.out.print("*");
}
System.out.println("");
if(i<n) {
spaces -=2;
}
else{
spaces+=2;
} 
    }


}

//output
// *       *
// **     **
// ***   ***
// **** ****
// **********
// **** ****
// ***   ***
// **     **


public static void fun15(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0 || j==0 || i==n-1 || j==n-1){
            System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}

//output
// ****
// *  *
// *  *
// ****
public static void main(String[] args) {
fun15(4);
}