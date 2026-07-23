public static void fun(String str,String ans){
if(str.length()==0){
    System.out.println(ans);
    return;
}
for(int i=0;i<str.length();i++){
    char curr = str.charAt(i);
    String Newstr=str.substring(0,i) + str.substring(i+1);
    fun(Newstr, ans+curr);
}

}
public static void main(String[] args) {
    String str = "abc";
    fun(str,"");
}

// str.substring(0,i)
// index 0 se i-1 tak characters leta hai

// str.substring(i+1)
// index i ke baad wale saare characters leta hai

// dono ko join karne se i-th character remove ho jata hai

// Example:
// str = "abcde"
// i = 2

// str.substring(0,2) = "ab"
// str.substring(3)   = "de"

// Newstr = "ab" + "de"
// Output = "abde"

// yani current character 'c' remove ho gaya