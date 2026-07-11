
public class UpdateIthbit{
    public static void main(String[] args) {
        System.out.println(fun(10,2,1));
    }
      public static int set(int n, int i){  // if i=1 then bitmask = 0010
        int bitMask=1<<i; 
            return   n | bitMask;  // 1010=10 1010 | 0010 = > 1010
    }
     public static int clear(int n, int i){
    int bitMask = ~(1<<i);  // 10 = 1010 & 1101 =>  1000
    return n & bitMask;

    }
    public static int fun(int n,int i,int newBit){
    if(newBit==0){
        return clear(n, i);
    }else{
        return set(n,i);
    }
    }
}
