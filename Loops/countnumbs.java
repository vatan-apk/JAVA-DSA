public class countnumbs {

    public static void main(StringArray[] args) {
        int n= 444567;
        int key =4;
        int count=0;
        while (n>0) {
            int num=n%10;
            if(num==key){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}