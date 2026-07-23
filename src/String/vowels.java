package string;

class vowels{
    public static void main(String[] args) {
        String str ="aeroplane";
       System.out.println( fun(str));
    // String s1 = "vatan";
    // String s2 = "kumar";
    // String s3 = "vatan";
    // System.out.println(fun2(s1,s2,s3));
    }
    public static String fun(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
        int ans= str.charAt(i);
        if(ans == 'a' || ans == 'e' || ans == 'i' || ans == 'o'|| ans == 'u'){
            count++;
        }
        }
        return String.valueOf(count);
    }
//     public static String fun2(String s1,String s2,String s3){
//         return s1.equals(s2) +" "+s1.equals(s3);
//     }
 }