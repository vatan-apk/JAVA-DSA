package functions;

public class binomial_coeffi {
    public static void main(String[] args) {
        int ans =binomial_coeffi(7, 1);
        System.out.println(ans);
    }

    static int n(int a){
        int fact =1;
for(int i=1;i<=a;i++){
    fact *=i;
}
return fact;

    } 
  
    static int binomial_coeffi(int a ,int b){

return  n(a)/(n(b)*n(a-b));

    }
}

