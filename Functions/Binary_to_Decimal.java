public class Binary_to_Decimal {
    public static void main(String[] args){
        int ans = Binary(1);
        System.out.println(ans);
    }
    public static int Binary(int a ){
        int decimal=0;
        int power=0;
        while(a>0){
            
          int   lastdigit = a%10;
          if(lastdigit!=1 && lastdigit!=0){
            System.out.println("INvalid number");
            return -1;
          }
            decimal +=  (lastdigit * Math.pow(2,power));
            a=a/10;
            power++;
              
        }
        return decimal;
    }
}
