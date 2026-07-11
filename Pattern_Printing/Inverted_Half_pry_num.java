public class Inverted_Half_pry_num {
    public static void main(String[] args) {
        Inverted_Half_pry_num(5);
    }
    public static void Inverted_Half_pry_num(int n){
        // int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            // count++;
            }
            System.out.println();
        }
    }
}
