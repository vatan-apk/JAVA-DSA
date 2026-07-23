package functions;

// public class Hw {
//     public static void main(String[] args) {
//         pallendrome(121);
//     }
//     public static void pallendrome(int a){
//         int rev=0;
// int original=a;
//         while (a>0) { 
//            int lastdigit=a%10;
//            rev = rev*10+lastdigit;
//            a/=10;
//         }
//         if(original==rev){
//             System.out.println("Is pallendrome");
//         }else{
//             System.out.println("Not an pallendrome");
//         }
//     }
// }


public class Hw{
    public static void main(String[] args) {
        sumofdigit(1234);
    }
   public static void sumofdigit(int a){
   int sum=0;
   while (a>0) { 
       int lastdigit=a%10;
       sum+=lastdigit;
       a/=10;
   }
   System.out.println(sum);
   }
} 

