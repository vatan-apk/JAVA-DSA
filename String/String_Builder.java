class String_Builder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello ");
        for(char ch ='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}