package loops;

// parameters 
// public class hw {
//     static boolean flag;
//     static int i;
//     static float f;
//     static double d;
//     static long l;
//     static String s;  
//     static short t;
//     static char c;
//     public static void main(String[] args) {
//         System.out.println("boolean : "+flag);
//                 System.out.println("int : "+i);
//         System.out.println("float : "+f);
//         System.out.println("double : "+d);
//         System.out.println("long : "+l);
//         System.out.println("short : "+t);
//         System.out.println("char : "+c);
//         System.out.println("string : "+s);

//     }
// }
// string buffer delete 
// public class hw {
// public static void main(String[] args) {
//     StringBuffer sb1 = new StringBuffer("hello world");
//     sb1.delete(0, 6);
//     System.out.println(sb1);
//     StringBuffer sb2 = new StringBuffer("some content");
//     System.out.println(sb2);
//     sb2.delete(0,sb2.length() );
//     System.out.println(sb2);
//     StringBuffer sb3 = new StringBuffer("Hello world");
//     sb3.deleteCharAt(0);
//     System.out.println(sb3);
    
// }


// }

// method overloading
// class A{
//     int l=10,b=20;
//     int area(){
//         return l*b;
//     }
//     int area(int l,int b){
//         return l*b;
//     }
// }
// public class hw {
// public static void main(String[] args) {
//     A r1 =new A();
//     int a1=r1.area();
//     System.out.println(a1);
// int a2=r1.area(2,20);
// System.out.println(a2);
// }
// }

// multi level inheritence

// class Animal{
//     void eat(){
//         System.out.println("Animal eats food");
//     }
// }
// class dog extends Animal{
//     void bark(){
//         System.out.println("Dog barks");
//     }
// }
// class puppy extends dog{
//     void play(){
//         System.out.println("Puppy plays");
//     }
// }
// public class hw{
//     public static void main(String[] args) {
//         puppy s =new puppy();
// s.eat();
// s.bark();
// s.play();

//     }
// }


class A {
    int l=20,b=10;
    int area(){
        return l*b;
    }
    int area(int l,int b){
        return l*b;
    }
}

public class hw {
    public static void main(String[] args) {
        A r1=new A();
        int  s1 = r1.area();
        System.out.println(s1);
        int s2 = r1.area(10,5);
        System.out.println(s2);
    }
}