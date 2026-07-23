package string;

class Pallendrome{
    public static boolean val(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println( val(str));
        fun(str);
    }
    public static void fun(String str){
        boolean flag= true;
        int i=0;
        int j=str.length()-1;
       while(i<j){
if(str.charAt(i)!=str.charAt(j)){
flag=false;
break;
}else{
i++;
j--;
}
       }
       if(flag){
        System.out.println("Is Pallendrome");
       }else{
        System.out.println("Not an Pallendrome");
       }
    }
}