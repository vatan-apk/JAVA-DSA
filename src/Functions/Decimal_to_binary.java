package functions;

public class Decimal_to_binary {
    public static void main(String[] args) {
        binToDec(7);
    }
   public static void binToDec(int n){
    int mynum=n;
int pow =0;
int binnum=0;
while (n>0) { 
    int rem = n%2;
    binnum=binnum+(rem*(int)Math.pow(10,pow));
    pow++;
    n=n/2;
}
System.out.println("Binary form of "+mynum+" = "+binnum);
    }
}
