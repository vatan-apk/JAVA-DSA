package functions;


public class StringExample2 {
    public static void main(String[] args) {
        String mera = my("BHOSADI");
        System.out.println(mera);
    }
    static String my(String name){
        String message = "BOL "+name;
        return message;
    }
}
