package pattern_printing;

public class Floyd_Triangle {
    public static void main(String[] args) {
    fun(5);
    }
    public static void fun(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
System.out.print(counter+" ");
counter++;
            }
            System.out.println();
        }
    }
}
