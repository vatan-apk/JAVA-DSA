package string;

import java.util.*;

public class Remove_Dubilcare{
public static void main(String[] args) {
    String str = "bcabc";
    HashSet<Character> set= new HashSet<>();
    StringBuilder ans = new StringBuilder();
    for(char ch: str.toCharArray()){
    if(!set.contains(ch)){
        set.add(ch);
        ans.append(ch);
    }
    }
    System.out.println(ans);
}
}