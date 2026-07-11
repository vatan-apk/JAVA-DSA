
public class StringExample2 {
    public static void main(StringArray[] args) {
        StringArray mera = my("BHOSADI");
        System.out.println(mera);
    }
    static StringArray my(StringArray name){
        StringArray message = "BOL "+name;
        return message;
    }
}
