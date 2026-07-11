public class Inverted_rotated_half_pry {
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int a){
     for(int i=1;i<=a;i++){
       for(int j=1;j<=a-i;j++){
            System.out.print(" ");
        }
    for(int j=1;j<=i;j++){
         System.out.print("*");
       }
       System.out.println();
    }
}
}