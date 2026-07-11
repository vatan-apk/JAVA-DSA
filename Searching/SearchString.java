public class SearchString {
    public static void main(String[] args) {
        
        String name =" vatan ";
        char key='n';
        System.out.println(search(name, key));   
    }
    static boolean search(String str, char key){
if(str.length() == 0){
    return false;
}
for(int i=0;i<str.length();i++){
    if(key == str.charAt(i)){
        return true;
    }
} 
return false;
    }    
}
