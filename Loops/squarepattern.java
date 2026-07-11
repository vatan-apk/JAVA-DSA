public class squarepattern {
    public static void main(String[] args) {
 int n = 1234;
 int lastdigit;
 int rev=0;
 while(n>0){
  lastdigit=n%10;
  n=n/10;
  rev = (rev*10)+lastdigit;

}
System.out.println(rev);

    }
}
