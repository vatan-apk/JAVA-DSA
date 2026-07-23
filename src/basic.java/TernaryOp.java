package basic_java;

public class TernaryOp {
    public static void main(String[] args) {
        int score =55;
        String passOrFail = (score>=60)? "pass" : "fail";
        System.out.println(passOrFail);
        int num=5;
        String evenOdd = (num%2==0)? "even" : "odd";
        System.out.println(evenOdd);
        int timeHours=13;
String time= (timeHours>12)? "pm" : "am";
System.out.println(time);
    }
}
