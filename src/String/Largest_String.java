package string;

public class Largest_String{
    public static void main(String[] args) {
        fun(args);
    }
    public static void fun(String ags[]){
String fruits[]={"apple","mango","banana"};
String Largest = fruits[0];
for(int i=1;i<fruits.length;i++){
    if(Largest.compareTo(fruits[i])<0){ // yani fruits[i] chota hai
    Largest=fruits[i];
    }
}
System.out.println(Largest);
    }
}
