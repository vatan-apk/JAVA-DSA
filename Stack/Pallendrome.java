import java.util.*;
public class Pallendrome{

    public static void pallen(LinkedList<Character> ch){
    Stack<Character> s = new Stack<>();
    for(char el : ch){
        s.push(el);
    }
 
 boolean flag = true;
 for(char el: ch){
    if(el != s.pop()){
        flag = false;
        break;
    }
 }

    if(flag){
        System.out.print("Valid Pallendrome");
    }else{
        System.out.println("InValid Pallendrome");
    }

    }

    public static String UnixPath(String str){
    Stack<String> s = new Stack<>();
 String[] parts = str.split("/");

 for(String dir : parts){
    if(dir.equals("") || dir.equals(".")){
        continue;
    }
    if(dir.equals("..")){
        if(!s.isEmpty()){
            s.pop();
    }    }else{
            s.push(dir);
        }

 }

 StringBuilder ans = new StringBuilder();

 for(String dir : s){
    ans.append("/").append(dir);
 }

 return ans.length() ==0 ? "/" : ans.toString();

    
    }
    public static void main(String[] args) {
       String str ="/apnacollege/";
System.out.println(UnixPath(str));       

    }
}