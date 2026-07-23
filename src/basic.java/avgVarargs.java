package basic_java;

public class avgVarargs {
    public static void main(String[] args) {
        System.out.println(avg(1,2,3,4));
    }
    static double avg(double... numbers){
        double sum=0;
        for(double number : numbers){
            sum+=number;
        }
        return sum;
    }
}
