package string;

import java.util.*;
class Basic{
public static void main(String[] args) {
    String str = "hello world!";
    print(str);
}
public static void print(String str){
    for(int i=0;i<str.length();i++){
        System.out.println(str.charAt(i));
    }
    System.out.println();
}
}