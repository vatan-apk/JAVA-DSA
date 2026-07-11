public class Remove_Dublicate{
    public static void main(String[] args) {
        String str = "appnnacollege";
        fun(str,0,new StringBuilder(""),new boolean[26]);
    }
    public static void fun(String str, int idx, StringBuilder newStr, boolean map[] ){
        if(idx == str.length()){
            System.err.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            fun(str,idx+1,newStr,map);
        } else{
            map[currChar-'a']=true;
            fun(str,idx+1,newStr.append(currChar),map);
        }
    }
}