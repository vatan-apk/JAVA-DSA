package basic_java;

public class Stringuse {
    public static void main(String[] args) {
        String name="Bro Code";
        int length = name.length();
        char letter = name.charAt(0);
        int index= name.indexOf("d");
        int lastIndex=name.lastIndexOf("o");
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);

        System.out.println(lastIndex);
        if(name.contains(" ")){
            System.out.println("Your name contain a space");
        }
    }
}
