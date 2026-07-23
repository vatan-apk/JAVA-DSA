public boolean isPalindrome(String s) {
        String reverse = "";
        for(int i=s.length();i>=0;i--){
            reverse +=s.charAt(i); 
        }
        return s.equals(reverse);
    }

    public static void main(String args[]){
   
   String s = "A man, a plan, a canal: Panama";

    }