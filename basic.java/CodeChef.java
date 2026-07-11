import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in= new Scanner(System.in);
String name = in.next().toLowerCase();
char[] arr= name.toCharArray();
Arrays.sort(arr);
if(Arrays.equals(arr,new char[]{'a','c','t'})){
    System.out.println("yes");
}else{
    System.out.println("No");
}
    }
}
	

