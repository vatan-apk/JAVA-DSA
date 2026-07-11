import java.util.*;
class ShortestPath{
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(fun(str));
    }
    public static float  fun(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }else if(str.charAt(i)=='S'){
                y--;
            }else if(str.charAt(i)=='E'){
                x++;
            }else{
                x--;
            }
        }
        float form = (float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return form;
    }
}