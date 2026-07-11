public class Sub_String{
public static void main(String[] args) {
    String Str ="Helloworld";
    System.out.println(Str.substring( 0, 5));
// System.out.println(fun(Str,0,5));
}
public static String fun(String Str, int si,int ed){
String suString="";
for(int i=si;i<ed;i++){
    suString +=Str.charAt(i);
}
return suString;
}
}