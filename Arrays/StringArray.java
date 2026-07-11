import java.util.Scanner;
import java.util.Arrays;
public class StringArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];  // now refers to java.lang.String
        
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();  // ✅ works fine
        }
str[1]="black";

        System.out.print(Arrays.toString(str));
    }
}
